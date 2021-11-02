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
    private String param;
    private int V;
    private int windowsCount = 5;
    private String timetable = "before dinner";

    public Window(String p) {
        param = p;
    }

    /**
     * Setter for timetable
     *
     * @param t Get's ONLY VALUES "before dinner" or "after dinner".
     * @return new timetable
     */
    public void setTimetable(String t) {
        this.timetable = t;
    }

    public String getTimetable () {
        return timetable;
    }

    /**
     * Calling client to a window
     */
    public void call() {
    }

    /**
     * getter for param
     *
     * @return new param
     */

    public String getParam() {
        return param;
    }

    /**
     * Setter for param
     *
     * @param str new value for it
     * @return new param with new value
     */
    public void setParam(String str) {
        this.param = str;
    }

    /**
     * getter for V
     * @return new V value
     */
    public int getV () {
        return this.V;
    }

    /**
     * setter for V
     * @param value new value for V
     */
    public void setV (int value) {
        this.V = value;
    }



    /**
     * WINDOWS COUNT GETTER
     * @return windowsCount
     */
    public int getWindowsCount (){
        return windowsCount;
    }

    /**
     * setter for windows count
     * @param count new amount of windows
     */
    public void setWindowsCount (int count) {
        this.windowsCount = count;
    }

}
