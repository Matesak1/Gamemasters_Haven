package commands;

import java.util.HashMap;
import java.util.Scanner;

public class Console {
    private Scanner sc = new Scanner(System.in);
    private boolean exit = false;
    private HashMap<String, Command> command = new HashMap<>();
    public void inicializace(){
        command.put("help", new Help());
        command.put("move", new Move());
        command.put("map", new Map());
    }
    private void enterCommand() {
        System.out.println(">>");
        String order = sc.nextLine();
        order = order.trim();
        order = order.toLowerCase();
        if (command.containsKey(order)) {
            System.out.println("<< " + command.get(order).execute());
        } else {
            System.out.println("<< A command like that doesnt exist.");
        }

    }
    public void start() {
        inicializace();
        System.out.println("Enter \"help\" to see the list of commands");
        try {
            do {
                enterCommand();
            } while (!exit);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
