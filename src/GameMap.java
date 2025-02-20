import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class GameMap{
    private String lokace = "Fight02";
  public boolean loadMap(){
      try (BufferedReader br = new BufferedReader(new FileReader("Map.txt"))){
          String line;
          while((line = br.readLine())!=null){
              String[] lines = line.split(" ");
              if(Objects.equals(lokace, lines[0])) {
                  for (int i = 0; i < 6; i++) {
                      if (!Objects.equals(lines[i], "null")) {
                          if (!Objects.equals(lines[i], "-")) {
                              switch(i){
                                  case 0:
                                      System.out.println("Currenty in room: "+lines[0]);
                                      break;
                                  case 2:
                                      System.out.println("To the left is: "+lines[2]);
                                      break;
                                  case 3:
                                      System.out.println("Above is: "+lines[3]);
                                      break;
                                  case 4:
                                      System.out.println("To the right is: "+lines[4]);
                                      break;
                                  case 5:
                                      System.out.println("On the bottom is: "+lines[5]);
                                      break;
                              }
                          }
                      }
                  }
              }
          }
          return true;
      } catch (IOException e) {
          return false;
      }




  }
}
