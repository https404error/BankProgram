package Bank;

import java.util.ArrayList;

/**
 * This file is the main file of all the programs
 * Object's of Window class and Information class are already created, so you have just to make new users in Terminal
 * We add every user to an ArrayOfUsers and iterate in range of the length of it, so after that we check every user if he /she
 * has right purpose and he came in certain time.
 * Also, we can change timetable, so ...
 * Also, I created a function to print and understand how many users have you got.
 * If you want to change time, you need to call method of Window class and set it to "after dinner"
 * !!! Program can work only with five users for now (will be fixed in next updates) !!!
 */

public class Bank {
    public static void main(String[] args) {
        Information info = new Information();
        Window wnd = new Window("получение документов");
        Window wnd2 = new Window("дебетовые и кредитные карты");
        Window wnd3 = new Window( "платежи");
        Window wnd4 = new Window("бизнес");
        Window wnd5 = new Window("кредит");
        System.out.println();
        System.out.println("System work: " + wnd.getTimetable());
        ArrayList<Window> allWindows = new ArrayList<Window>();
        allWindows.add(wnd);
        allWindows.add(wnd2);
        allWindows.add(wnd3);
        allWindows.add(wnd4);
        allWindows.add(wnd5);
        boolean after_dinner = false;
        for (Window w: allWindows) {
            // Write here: w.setTimetable("after dinner"); if you want to change TT.
//            System.out.println(w.getParam());
            if (w.timetable.equals("after dinner")) {
                after_dinner = true;
                w.param = "получение документов";
            }
        }
        if (after_dinner) {
            System.out.println();
            System.out.println("Timetable has been changed to: " + wnd.getTimetable());
            System.out.println("Setting all windows to: " + "получение документов");
        }
        System.out.println();
        //        //        System.out.println(wnd.getTimetable());
//        System.out.println(wnd2.get`Timetable());
//        System.out.println(wnd3.getTimetable());
//        System.out.println(wnd4.getTimetable());
//        System.out.println(wnd5.getTimetable());
        Terminal user1 = new Terminal("получение документов");
        Terminal user2 = new Terminal("платежи");
        Terminal user3 = new Terminal("кредит");
        Terminal user4 = new Terminal("дебетовые и кредитные карты");
        Terminal user5 = new Terminal("кредит");
        // So if you want to make new users, you just write
        // Terminal userX = new Terminal(); And write a purpose for him;
        ArrayList<Terminal> allUsers = new ArrayList<Terminal>();
        allUsers.add(user1);
        allUsers.add(user2);
        allUsers.add(user3);
        allUsers.add(user4);
        allUsers.add(user5);
        int usersCount = 0;
        for (Terminal user : allUsers) {
            usersCount++;
            if (wnd.timetable.equals("after dinner") && !(user.purpose.equals("получение документов"))) {
                info.show(user, wnd.getParam(), usersCount);
                user.deny();
            }
            for (Window w : allWindows) {
                if (user.purpose.equals(w.getParam())) {
                    info.show(user, w.getParam(), usersCount);
                }
            }
        }
        System.out.println();
        getAllUsers(allUsers);
        System.out.println();
        info.getTime();
    }

    public static void getAllUsers(ArrayList arrayList) {
        for (Object user : arrayList) {
            System.out.println(user);
        }
    }
}