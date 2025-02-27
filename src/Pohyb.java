import java.util.Objects;
import java.util.Scanner;

public class Pohyb {
    Scanner sc = new Scanner(System.in);
    GameMap g = new GameMap();
    public void pohyb(String smer){
       // try {
            switch (smer) {
                case "up":
                    if(!Objects.equals(g.getLines(3), "null")) {
                        g.setLokace(g.getLines(3));
                    }else{
                        System.out.println("Theres no room here");
                    }
                    break;
                case "left":
                    if(!Objects.equals(g.getLines(2), "null")) {
                        g.setLokace(g.getLines(2));
                    }else{
                        System.out.println("Theres no room here");
                    }
                    break;
                case "down":
                    if(!Objects.equals(g.getLines(5), "null")) {
                        g.setLokace(g.getLines(5));
                    }else{
                        System.out.println("Theres no room here");
                    }
                    break;
                case "right":
                    if(!Objects.equals(g.getLines(4), "null")) {
                        g.setLokace(g.getLines(4));
                    }else{
                        System.out.println("Theres no room here");
                    }
                    break;
                default:
                    System.out.println("This isnt a direction, try again");
                    pohyb(sc.next());
                    break;
            }
       // }catch (Exception e){
       //     System.out.println("Nastala chyba v pohybu");
        //    pohyb(sc.next());
       // }
    }
}
