package littlebreadloaf.bleach.events;












public class BleachSounds
{
  private static final String BLEACH = "bleach".toLowerCase() + ":";
  
  public static String[] soundFiles = { "bowcharge.ogg", "bowfire.ogg", "fisherlaugh1.ogg", "fisherlaugh2.ogg", "fisherlaugh3.ogg", "hollowscream.ogg", "ore_hollow.ogg", "shunpo.ogg" };
  public static String[] streamingFiles = { "asterisk.ogg", "NumberOne.ogg", "Escalon.ogg" };
  public static String[] HuecoMundoMusic = { "ardor.ogg", "belong.ogg", "heart.ogg", "home.ogg", "stay.ogg" };
  









































































  public boolean isHuecoMundoMusic(String name)
  {
    for (int i = 0; i < HuecoMundoMusic.length; i++)
    {
      if (name.equals("bleach:" + HuecoMundoMusic[i])) {
        return true;
      }
    }
    return false;
  }
}
