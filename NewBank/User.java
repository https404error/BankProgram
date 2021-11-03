package NewBank;

import java.util.Date;

/**
 * Class User aims at getting purpose, time, clients self params;
 * After that, user sends information to Terminal;
 */

public class User {
    private String purpose;
    private Date date;
    private int numb;
    private String pasport;


    /**
     * Constructor;
     */
    public User () {}

    /**
     * User sets his pasport params
     * @param data
     */
    public void setPasport (String data) {
        this.purpose = data;
    }



    /**
     * Says welcome to user and prints out all information about company and its services;
     */
    public void start () {}

    /**
     * This method sends information that user wrote to terminal
     * @param purpose Purpose
     * @param date date (Later we just take hour from it)
     */
    public void SendForm (String purpose, Date date) {}

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public Date getDate() {
        return date;
    }

    public int getNumb() {
        return numb;
    }
}