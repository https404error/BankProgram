package Bank;

/**
 * Class Information aims at printing information on the timetable
 * First method showing Talon number and Window number;
 * Second method printing time, required for working with one person.
 */
public class Information {
    public void show(Terminal user, String wnd, int amount) {
        System.out.print("Talon number: " + " " + " " + " " + " " + " " +" " + " " + " " + " " + " " + "Window number: ");
        System.out.println();
        System.out.println(amount + "." + " " + user + " " + " "+ " "+ " "+ " " + wnd);
    }
    public void getTime () {
        System.out.println("One user's processing is about 5 minutes");
    }

}