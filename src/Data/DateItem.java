package Data;

public class DateItem {
/*
Attributes
*/
    private int year;
    private int month;
    private int day;
    private int qty;
/*
Constructors
*/
    public DateItem(){}
    public DateItem( int year, int month,int day, int qty){
        this.year = year;
        this.month=month;
        this.day=day;
        this.qty = qty;}
/*
Getters and Setters
*/
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
/*
Method toString. Return all month-days related to this item in order to be printed
*/
    @Override
    public String toString() {
        return
              "\t\t\t-" + day +"(" + qty + ")\n";}
}
