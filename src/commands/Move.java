package commands;

import javax.management.monitor.GaugeMonitor;
import java.util.Objects;
import java.util.Scanner;

public class Move extends Command{
    Scanner sc = new Scanner(System.in);

    public Move() {

    }

    @Override
    public String execute() {
        System.out.println("Type up/left/down/right");
        try {
            switch (sc.next()) {
                case "up":
                    if() {

                    }else{

                        return "Theres no room here";
                    }
                case "left":
                    if() {

                    }else{

                        return "Theres no room here";
                    }
                case "down":
                    if() {

                    }else{

                        return "Theres no room here";
                    }
                case "right":
                    if(){

                    }else{

                        return "Theres no room here";
                    }
                default:
                    return "This isnt a direction";
            }
        }catch (Exception e){
            return "Error in movement";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
