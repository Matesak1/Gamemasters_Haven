import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  GameMap gameMap = new GameMap();
        Scanner sc = new Scanner(System.in);
  Pohyb p = new Pohyb();
        gameMap.loadMap();
        p.pohyb(sc.next());
        gameMap.loadMap();
    }
}