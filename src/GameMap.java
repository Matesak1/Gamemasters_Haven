import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class GameMap{
  public boolean loadMap(){
      try (BufferedReader br = new BufferedReader(new FileReader("Map.txt"))){
          String line;
          while((line = br.readLine())!=null){
              String[] lines = line.split(" ");
              for (int i = 0; i < 6; i++) {
                  if(!Objects.equals(lines[i], "null")){
                      if(!Objects.equals(lines[i],"-")) {
                          System.out.println(lines[i]);
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
