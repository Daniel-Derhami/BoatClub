package model;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WorkShopException extends Exception {
    private Exception origException;
    private String date;
    private String time;

    public WorkShopException(Exception origException){
        setOrigException(origException);
        Calendar cal = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        DateFormat tf = new SimpleDateFormat("HH:mm:ss");
        setDate(df.format(cal.getTime()));
        setTime(tf.format(cal.getTime()));
    }
    public Exception getOrigException() {
        return origException;
    }

    public void setOrigException(Exception origException) {
        this.origException = origException;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
