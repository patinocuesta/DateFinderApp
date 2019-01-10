import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ParserFormats {
    private List<SimpleDateFormat> listDateFormatEn;

    public ParserFormats(){
        listDateFormatEn = Arrays.asList(
        new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH),
        new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH),
        new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH),
        new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH),
        new SimpleDateFormat("yyyy MM. dd", Locale.ENGLISH),
        new SimpleDateFormat("MM. dd, yyyy", Locale.ENGLISH));
    }

    public List<SimpleDateFormat> getListDateFormatEn() {
        return listDateFormatEn;
    }

    public void setListDateFormatEn(List<SimpleDateFormat> listDateFormatEn) {
        this.listDateFormatEn = listDateFormatEn;
    }

    public List<SimpleDateFormat> SimpleDateFormatListing() {return listDateFormatEn; }
}
