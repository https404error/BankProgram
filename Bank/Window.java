package Bank;

/**
 * Class window aims at window's working and checking purpose, speed and timetable of the Bank
 * timetable variable can get only "before dinner" and "after dinner" values !!!
 */

public class Window {
    /**
     * V - speed of the crowd
     * windowsCount - amount of opened window's
     * timetable - get understanding of the time.
     */
    String param;
    int V;
    int windowsCount = 5;
    String timetable = "before dinner";
    public Window (String p) {
        param = p;
    }

    /**
     * Setter for timetable
     * @param t Get's ONLY VALUES "before dinner" or "after dinner".
     * @return new timetable
     */
    public String setTimetable (String t) {
        timetable = t;
        return timetable;
    }

    /**
     * Calling client to a window
     */
    public void call () {}

    /**
     * V GETTER
     * @return V
     */
    public int getV () {
        return V;
    }

    /**
     * WINDOWS COUNT GETTER
     * @return windowsCount
     */
    public int getWindowsCount (){
        return windowsCount;
    }

    /**
     * Getter for timetable
     * @return timetable
     */
    public String getTimetable () {
        return timetable;
    }

    /**
     * getter for param
     * @return param
     */
    public String getParam () {
        return param;
    }

}