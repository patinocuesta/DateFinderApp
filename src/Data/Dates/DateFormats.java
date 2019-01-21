package Data.Dates;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/**
 * Class defining a date formats list including all formats we want to detect in any given text
 */
public class DateFormats {
    private List<SimpleDateFormat> listDateFormatEn;
/**
 * Constructor
 */
    public DateFormats(){
        listDateFormatEn = Arrays.asList(
        new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH),
        new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH),
        new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH),
        new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH),
        new SimpleDateFormat("yyyy MM. dd", Locale.ENGLISH),
        new SimpleDateFormat("MM. dd, yyyy", Locale.ENGLISH));}
/**
* Getters and Setters
*/
    public List<SimpleDateFormat> getListDateFormatEn() {
        return listDateFormatEn;
    }
    public void setListDateFormatEn(List<SimpleDateFormat> listDateFormatEn) {this.listDateFormatEn = listDateFormatEn;}
    public List<SimpleDateFormat> SimpleDateFormatListing() {return listDateFormatEn;}
}
