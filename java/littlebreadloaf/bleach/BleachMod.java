package littlebreadloaf.bleach;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.EventBus;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import littlebreadloaf.bleach.armor.Armor;
import littlebreadloaf.bleach.blocks.BleachBlocks;
import littlebreadloaf.bleach.commands.CommandResetHollow;
import littlebreadloaf.bleach.commands.CommandResetSpirit;
import littlebreadloaf.bleach.commands.CommandSetFaction;
import littlebreadloaf.bleach.commands.CommandSetSpirit;
import littlebreadloaf.bleach.commands.CommandSetType;
import littlebreadloaf.bleach.commands.CommandSpirit;
import littlebreadloaf.bleach.commands.CommandToggle3D;
import littlebreadloaf.bleach.events.BleachEvents;
import littlebreadloaf.bleach.items.BleachItems;
import littlebreadloaf.bleach.network.ActivateMessage;
import littlebreadloaf.bleach.network.ActivateMessage.Handler;
import littlebreadloaf.bleach.network.ClientSyncMessage;
import littlebreadloaf.bleach.network.ClientSyncMessage.Handler;
import littlebreadloaf.bleach.network.DeactivateMessage;
import littlebreadloaf.bleach.network.DeactivateMessage.Handler;
import littlebreadloaf.bleach.network.FlashMessage;
import littlebreadloaf.bleach.network.FlashMessage.Handler;
import littlebreadloaf.bleach.network.GuiMessage;
import littlebreadloaf.bleach.network.GuiMessage.Handler;
import littlebreadloaf.bleach.network.HollowPieceMessage;
import littlebreadloaf.bleach.network.HollowPieceMessage.Handler;
import littlebreadloaf.bleach.network.MoveMessage;
import littlebreadloaf.bleach.network.MoveMessage.Handler;
import littlebreadloaf.bleach.network.ParticleMessage;
import littlebreadloaf.bleach.network.ParticleMessage.Handler;
import littlebreadloaf.bleach.network.ServerSyncMessage;
import littlebreadloaf.bleach.network.ServerSyncMessage.Handler;
import littlebreadloaf.bleach.proxies.CommonProxy;
import littlebreadloaf.bleach.tiles.TileLantern;
import littlebreadloaf.bleach.tiles.TileSeeleSchneider;
import littlebreadloaf.bleach.tiles.TileSphereLamp;
import littlebreadloaf.bleach.world.BleachWorldGen;
import littlebreadloaf.bleach.world.HuecoMundoWorldProvider;
import littlebreadloaf.bleach.world.SoulSocietyWorldProvider;
import littlebreadloaf.bleach.world.biomes.BleachBiomes;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid="bleach", name="LittleBreadLoaf's Bleach Mod", version="F1.0.4")
public class BleachMod
{
  @cpw.mods.fml.common.SidedProxy(clientSide="littlebreadloaf.bleach.proxies.ClientProxy", serverSide="littlebreadloaf.bleach.proxies.CommonProxy")
  public static CommonProxy proxy;
  @Mod.Instance("bleach")
  public static BleachMod instance;
  public static SimpleNetworkWrapper network;
  
  @Mod.EventHandler
  public static void preInit(FMLPreInitializationEvent event)
  {
    network = NetworkRegistry.INSTANCE.newSimpleChannel("BleachChannel");
    proxy.loadMessages();
    network.registerMessage(ServerSyncMessage.Handler.class, ServerSyncMessage.class, 0, Side.SERVER);
    network.registerMessage(ClientSyncMessage.Handler.class, ClientSyncMessage.class, 1, Side.CLIENT);
    network.registerMessage(ActivateMessage.Handler.class, ActivateMessage.class, 3, Side.SERVER);
    network.registerMessage(DeactivateMessage.Handler.class, DeactivateMessage.class, 4, Side.SERVER);
    network.registerMessage(FlashMessage.Handler.class, FlashMessage.class, 5, Side.SERVER);
    network.registerMessage(ParticleMessage.Handler.class, ParticleMessage.class, 6, Side.CLIENT);
    network.registerMessage(MoveMessage.Handler.class, MoveMessage.class, 7, Side.CLIENT);
    network.registerMessage(GuiMessage.Handler.class, GuiMessage.class, 8, Side.CLIENT);
    network.registerMessage(HollowPieceMessage.Handler.class, HollowPieceMessage.class, 9, Side.SERVER);
    network.registerMessage(littlebreadloaf.bleach.network.CeroMessage.Handler.class, littlebreadloaf.bleach.network.CeroMessage.class, 10, Side.SERVER);
    
    BleachItems.init();
    BleachItems.registerItems();
    
    BleachBlocks.init();
    BleachBlocks.registerBlocks();
    proxy.initRenderers();
    ConfigHandler.init(event.getSuggestedConfigurationFile());
    
    GameRegistry.registerWorldGenerator(new BleachWorldGen(), 0);
    new BleachBiomes();
    
    DimensionManager.registerProviderType(BleachIds.worldHuecoMundoID, HuecoMundoWorldProvider.class, false);
    DimensionManager.registerDimension(BleachIds.worldHuecoMundoID, BleachIds.worldHuecoMundoID);
    
    DimensionManager.registerProviderType(BleachIds.worldSoulSocietyID, SoulSocietyWorldProvider.class, false);
    DimensionManager.registerDimension(BleachIds.worldSoulSocietyID, BleachIds.worldSoulSocietyID);
  }
  





  @Mod.EventHandler
  public static void init(FMLInitializationEvent event)
  {
    littlebreadloaf.bleach.entities.Entities.init();
    
    Armor.init();
    Armor.registerItems();
    
    new littlebreadloaf.bleach.gui.GuiHandler();
    FMLCommonHandler.instance().bus().register(new littlebreadloaf.bleach.events.BleachPlayerTickHandler());
    Recipes.init();
    
    GameRegistry.registerWorldGenerator(new littlebreadloaf.bleach.extras.OreGenerator(), 0);
    
    MinecraftForge.EVENT_BUS.register(new BleachEvents());
    proxy.loadKeys();
    
    GameRegistry.registerTileEntity(TileSphereLamp.class, "TileSphereLamp");
    GameRegistry.registerTileEntity(TileLantern.class, "TileLantern");
    GameRegistry.registerTileEntity(TileSeeleSchneider.class, "TileSeeleschneider");
    
    proxy.initZanpakutoRenderers();
  }
  
  @Mod.EventHandler
  public static void postInit(FMLPostInitializationEvent event)
  {
    proxy.loadGUI();
  }
  
  @Mod.EventHandler
  public void serverStart(FMLServerStartingEvent event)
  {
    MinecraftServer server = MinecraftServer.getServer();
    ICommandManager command = server.getCommandManager();
    ServerCommandManager serverCommand = (ServerCommandManager)command;
    
    serverCommand.registerCommand(new CommandResetSpirit());
    serverCommand.registerCommand(new littlebreadloaf.bleach.commands.CommandResetType());
    serverCommand.registerCommand(new CommandSetSpirit());
    serverCommand.registerCommand(new CommandSetType());
    serverCommand.registerCommand(new CommandSpirit());
    serverCommand.registerCommand(new CommandSetFaction());
    serverCommand.registerCommand(new CommandToggle3D());
    serverCommand.registerCommand(new CommandResetHollow());
  }
}
