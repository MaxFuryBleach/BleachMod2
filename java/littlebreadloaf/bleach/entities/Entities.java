package littlebreadloaf.bleach.entities;

import cpw.mods.fml.common.registry.EntityRegistry;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.world.biomes.BleachBiomes;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;




public class Entities
{
  public static void init()
  {
    EntityRegistry.registerGlobalEntityID(EntityWhole.class, "Whole", EntityRegistry.findGlobalUniqueEntityId(), 3368652, 3342540);
    EntityRegistry.addSpawn(EntityWhole.class, 8, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] { BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach, BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
    

    EntityRegistry.registerGlobalEntityID(EntityHollowBat.class, "HollowBat", EntityRegistry.findGlobalUniqueEntityId(), 0, 11735573);
    EntityRegistry.addSpawn(EntityHollowBat.class, 6, 2, 4, EnumCreatureType.monster, new BiomeGenBase[] { BleachBiomes.HuecoMundo, BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach, BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
    


    EntityRegistry.registerGlobalEntityID(EntityHollowBlaze.class, "HollowBlaze", EntityRegistry.findGlobalUniqueEntityId(), 0, 3978097);
    EntityRegistry.addSpawn(EntityHollowBlaze.class, 6, 2, 4, EnumCreatureType.monster, new BiomeGenBase[] { BleachBiomes.HuecoMundo, BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach, BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
    

    EntityRegistry.registerGlobalEntityID(EntityHollowSpider.class, "HollowSpider", EntityRegistry.findGlobalUniqueEntityId(), 0, 1644912);
    EntityRegistry.addSpawn(EntityHollowSpider.class, 6, 2, 4, EnumCreatureType.monster, new BiomeGenBase[] { BleachBiomes.HuecoMundo, BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach, BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
    

    EntityRegistry.registerGlobalEntityID(EntityHollowGolem.class, "HollowGolem", EntityRegistry.findGlobalUniqueEntityId(), 9109504, 16777200);
    EntityRegistry.addSpawn(EntityHollowGolem.class, 6, 2, 4, EnumCreatureType.monster, new BiomeGenBase[] { BleachBiomes.HuecoMundo, BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach, BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
    

    EntityRegistry.registerGlobalEntityID(EntityHollowSnake.class, "HollowSnake", EntityRegistry.findGlobalUniqueEntityId(), 39219, 15787660);
    EntityRegistry.addSpawn(EntityHollowSnake.class, 6, 2, 4, EnumCreatureType.monster, new BiomeGenBase[] { BleachBiomes.HuecoMundo, BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach, BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
    

    EntityRegistry.registerGlobalEntityID(EntityHollowWasp.class, "HollowWasp", EntityRegistry.findGlobalUniqueEntityId(), 0, 16763955);
    EntityRegistry.addSpawn(EntityHollowWasp.class, 6, 2, 4, EnumCreatureType.monster, new BiomeGenBase[] { BleachBiomes.HuecoMundo, BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach, BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
    

    EntityRegistry.registerGlobalEntityID(EntityHollowStalker.class, "HollowStalker", EntityRegistry.findGlobalUniqueEntityId(), 0, 6506099);
    EntityRegistry.addSpawn(EntityHollowStalker.class, 6, 2, 4, EnumCreatureType.monster, new BiomeGenBase[] { BleachBiomes.HuecoMundo, BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach, BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
    

    EntityRegistry.registerGlobalEntityID(EntityHollowOre.class, "HollowOre", EntityRegistry.findGlobalUniqueEntityId(), 0, 357785);
    EntityRegistry.addSpawn(EntityHollowOre.class, 0, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] { BleachBiomes.HuecoMundo, BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach, BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
    

    EntityRegistry.registerGlobalEntityID(EntityHollowWolf.class, "HollowWolf", EntityRegistry.findGlobalUniqueEntityId(), 1644912, 6506099);
    EntityRegistry.addSpawn(EntityHollowWolf.class, 6, 3, 5, EnumCreatureType.monster, new BiomeGenBase[] { BleachBiomes.HuecoMundo, BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach, BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
    


    EntityRegistry.registerGlobalEntityID(EntitySmallHollowLizard.class, "SmallHollowLizard", EntityRegistry.findGlobalUniqueEntityId(), 9127187, 11674146);
    EntityRegistry.addSpawn(EntitySmallHollowLizard.class, 10, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] { BleachBiomes.HuecoMundo });
    


    EntityRegistry.registerGlobalEntityID(EntityMenosGrande.class, "MenosGrande", EntityRegistry.findGlobalUniqueEntityId(), 0, 16777215);
    EntityRegistry.addSpawn(EntityMenosGrande.class, 15, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] { BiomeGenBase.hell });
    

    EntityRegistry.registerGlobalEntityID(EntityFisher.class, "Fisher", EntityRegistry.findGlobalUniqueEntityId(), 0, 6697728);
    EntityRegistry.addSpawn(EntityFisher.class, 8, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] { BiomeGenBase.hell });
    

    EntityRegistry.registerGlobalEntityID(EntityDecoy.class, "Decoy", EntityRegistry.findGlobalUniqueEntityId(), 0, 0);
    EntityRegistry.addSpawn(EntityDecoy.class, 8, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] { BleachBiomes.HuecoMundo, BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach, BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
    



    EntityRegistry.registerGlobalEntityID(EntityShinigami.class, "Shinigami", EntityRegistry.findGlobalUniqueEntityId(), 0, 6779513);
    EntityRegistry.addSpawn(EntityShinigami.class, 8, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] { BleachBiomes.HuecoMundo, BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach, BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
    







    EntityRegistry.registerGlobalEntityID(EntityEnergyArrow.class, "EnergyArrow", EntityRegistry.findGlobalUniqueEntityId());
    EntityRegistry.registerModEntity(EntityEnergyArrow.class, "EnergyArrow", 0, BleachMod.instance, 128, 1, true);
    
    EntityRegistry.registerGlobalEntityID(EntitySeeleArrow.class, "SeeleArrow", EntityRegistry.findGlobalUniqueEntityId());
    EntityRegistry.registerModEntity(EntitySeeleArrow.class, "SeeleArrow", 1, BleachMod.instance, 128, 1, true);
    
    EntityRegistry.registerGlobalEntityID(EntityGetsuga.class, "Getsuga", EntityRegistry.findGlobalUniqueEntityId());
    EntityRegistry.registerModEntity(EntityGetsuga.class, "Getsuga", 2, BleachMod.instance, 128, 1, true);
    
    EntityRegistry.registerGlobalEntityID(EntityShotBlock.class, "EntityShotBlock", EntityRegistry.findGlobalUniqueEntityId());
    EntityRegistry.registerModEntity(EntityShotBlock.class, "EntityShotBlock", 3, BleachMod.instance, 128, 1, true);
    
    EntityRegistry.registerGlobalEntityID(EntityBlock.class, "EntityBlock", EntityRegistry.findGlobalUniqueEntityId());
    EntityRegistry.registerModEntity(EntityBlock.class, "EntityBlock", 4, BleachMod.instance, 128, 1, true);
    
    EntityRegistry.registerGlobalEntityID(EntityCero.class, "EntityCero", EntityRegistry.findGlobalUniqueEntityId());
    EntityRegistry.registerModEntity(EntityCero.class, "EntityCero", 5, BleachMod.instance, 128, 1, true);
    
    EntityRegistry.registerGlobalEntityID(EntityGlob.class, "EntityGlob", EntityRegistry.findGlobalUniqueEntityId());
    EntityRegistry.registerModEntity(EntityGlob.class, "EntityGlob", 6, BleachMod.instance, 128, 1, true);
  }
}
