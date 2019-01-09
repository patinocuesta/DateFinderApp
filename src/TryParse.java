import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TryParse {
    //private List<String> formatStrings;
    private List<SimpleDateFormat> formatsDate = new ArrayList<>();

    public TryParse() {
        formatsDate.add(new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH));
        formatsDate.add(new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH));
        formatsDate.add(new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH));
        formatsDate.add(new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH));
        formatsDate.add(new SimpleDateFormat("yyyy MM. dd", Locale.ENGLISH));
        formatsDate.add(new SimpleDateFormat("MM. dd, yyyy", Locale.ENGLISH));
    }


    public List<SimpleDateFormat> getFormatsDate() {
        return formatsDate;
    }

    public void setFormatsDate(List<SimpleDateFormat> formatsDate) {
        this.formatsDate = formatsDate;
    }


    public List<Date> parseListStrToListDate(List<String> listStr) {
        List<Date> dates = null;
        for (String item : listStr) {
            for (int i = 0; i < formatsDate.size(); i++) {
                try {
                    Date date = formatsDate.get(i).parse(item);

                    if (date!=null) {
                        System.out.println(date);
                        dates.add(i,date);
                    }

                } catch (Exception e1) {
                    //e1.printStackTrace();
                }

            }
        }


        return dates;
    }

}