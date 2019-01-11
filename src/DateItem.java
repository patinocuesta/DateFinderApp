import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateItem {


   // private Date date;
    private int year;
    private int month;
    private int day;
    private int qty;


    public DateItem(){}
    public DateItem( int year, int month,int day, int qty){
        this.year = year;
        this.month=month;
        this.day=day;
      //  this.date = date;
        this.qty = qty;

    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
