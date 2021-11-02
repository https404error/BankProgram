package Bank;

import java.util.Date;

/**
 * Class Terminal aims at adding, accepting and denying and printing client's requests
 * Also there are two fields of date and purpose, to control it.
 */

public class Terminal {
    private int numb;
    private Date date;
    private String purpose;

    /**
     * Get purpose
     * @param p - purpose
     */
    public Terminal (String p) {
        numb++;
        purpose = p;
    }

    public void setNumb(int value) {
        this.numb = value;
    }
    public int getNumb () {
        return numb;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    /**
     * Accepting client
     * @return SomeValue
     */
    private int accept() {
        return 0;
    }

    /**
     * Denies client's request
     * @return SomeValue
     */
    public int deny() {
        return 1;
    }

    /**
     * Just prints client's talon and give to know that you need to wait for your time
     * @return Notification
     */
    private String getTalon() {
        return "Here is your talon!";
    }
}
