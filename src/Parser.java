import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class Parser {
    private List<String> listStr;
    private List<SimpleDateFormat> listDateFormat;

    public Parser() { }

    public Parser(List<String> listStr, List<SimpleDateFormat> listDateFormat, List<Date> listDates) {
        this.listStr = listStr;
        this.listDateFormat = listDateFormat;
    }

    public List<String> getListStr() {
        return listStr;
    }
    public void setListStr(List<String> listStr) {
        this.listStr = listStr;
    }
    public List<SimpleDateFormat> getListDateFormat() {



        return listDateFormat;
    }
    public void setListDateFormat(List<SimpleDateFormat> listDateFormat) {
        this.listDateFormat = listDateFormat;
    }

}

