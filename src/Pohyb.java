import java.util.Objects;
import java.util.Scanner;

public class Pohyb{


    public String pohyb(String smer, String vlevo, String nahoru, String vpravo, String dolu){
        try {
            switch (smer) {
                case "up":
                    if(!Objects.equals(nahoru, "null")) {
                        return nahoru;
                    }else{
                        System.out.println("Theres no room here");
                        return "again";
                    }
                case "left":
                    if(!Objects.equals(vlevo, "null")) {
                        return vlevo;
                    }else{
                        System.out.println("Theres no room here");
                        return "again";
                    }
                case "down":
                    if(!Objects.equals(dolu, "null")) {
                        return dolu;
                    }else{
                        System.out.println("Theres no room here");
                        return "again";
                    }
                case "right":
                    if(!Objects.equals(vpravo, "null")) {
                        return vpravo;
                    }else{
                        System.out.println("Theres no room here");
                        return "again";
                    }
                default:
                    System.out.println("This isnt a direction, try again");
                    return "again";
            }
        }catch (Exception e){
            System.out.println("Nastala chyba v pohybu");
            return "again";
        }

    }
}
