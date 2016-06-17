package factory.aufgabe1;

/**
 * Created by edutilos on 17.06.2016.
 */
public class BackpackFactory {
  public Backpack createBackpack(String type) {
      Backpack bp ;
      switch(type) {
          case "magier": bp = new MagierBackpack();
              break;
          case "waldlaeufer": bp = new WaldlaeuferBackpack();
              break;
          default:
              bp = new MagierBackpack();
      }

      return bp;
  }
}
