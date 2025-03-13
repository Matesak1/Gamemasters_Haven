import java.util.Objects;
import java.util.Scanner;

public class Console {
    Scanner sc = new Scanner(System.in);
    GameMap g = new GameMap();
    Pohyb p = new Pohyb();
    private String save;
    public void start(){
        g.loadMap();
        save = g.getLokace();
        do {
            do {
                g.setLokace(save);
                g.setLokace(p.pohyb(sc.next(), g.getLines(2), g.getLines(3), g.getLines(4), g.getLines(5)));
            }while(Objects.equals(g.getLokace(), "again"));
            save = g.getLokace();
            g.loadMap();
        }while(!Objects.equals(g.getLokace(), "Finish"));


    }
}
