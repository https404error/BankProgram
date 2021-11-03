package NewBank;

import java.util.Date;

/**
 * Main class aimed at starting and processing all the program.
 * Here we create all objects of classes and unit them all together;
 */

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Date currentDate = new Date();
        user.start();
        user.setPurpose("purpose");
        user.setDate(currentDate);
        user.setPasport("someValues");
        Terminal terminal = new Terminal();
        terminal.connectToSystem("purpose", currentDate);
        if (terminal.checkStatus() == 1) {
            terminal.accept();
            terminal.addToTable();
        } else {
            terminal.deny();
            terminal.endSession();
        }
    }
}