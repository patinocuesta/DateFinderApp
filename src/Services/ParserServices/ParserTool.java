package Services.ParserServices;

import Data.Dates.DateItem;
import Data.Dates.DateFormats;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.joining;
/**
 * Class for creating a structured list of dates from list of strings containing the dates detected in a text.
 */
public class ParserTool {

    private DateFormats dateFormats = new DateFormats();
    private List<SimpleDateFormat> simpleDateFormats;
/**
*Constructor
*/
    public ParserTool (){ }
    public ParserTool (DateFormats dateFormats, List<SimpleDateFormat> simpleDateFormats){
    this.dateFormats = dateFormats;
    this.simpleDateFormats =  simpleDateFormats;}
/**
*Method for parsing a String list containing dates into a list of dates.
*/
    public List<Date> parseListStrToListDate(List<String> listStr) {
        simpleDateFormats = dateFormats.SimpleDateFormatListing();
        List<Date> dates = new ArrayList<Date>();
        for (String item : listStr) {
            for (SimpleDateFormat simpleDateFormat : simpleDateFormats){
                try {
                    Date date = simpleDateFormat.parse(item);
                    dates.add(date);
                    break;
                } catch (Exception e1) {
                    // e1.printStackTrace();
                }
            }
        }
        Collections.sort(dates);
        return dates;}
/**
* Method to format a dates in a list of dates with a default format
*/
    public  List<DateItem> formatListToMap (List<Date> dates){
        //Creating map to eliminate duplicates
        Map<Date, Integer> map = new LinkedHashMap<Date, Integer>();
        //mapping the list
            for (Date date : dates) {
            map.put(date, Collections.frequency(dates, date));}
            //Giving format to every date in list of dates
        List<DateItem> dateItems = new ArrayList<DateItem>();
        Date dateItem;
        //Format given by Calendar class
            for (Map.Entry<Date, Integer> mapentry : map.entrySet()) {
            dateItem = mapentry.getKey();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateItem);
            dateItems.add(new DateItem(calendar.get(Calendar.YEAR),
                                       calendar.get(Calendar.MONTH) + 1,
                                       calendar.get(Calendar.DAY_OF_MONTH),
                                       mapentry.getValue()));}
            return dateItems;}
/**
 * Method for mapping the map we've created in formatListToMap in order to get dates grouped as demanded.
 * @param dateItems
 * @return
 */
    public String  ListToMultilevelMapToString (List<DateItem> dateItems){
        Map<Integer, Map<Integer, List<DateItem>>> mapDateItems=dateItems
                .stream()
                .collect(
                        Collectors.groupingBy(p ->p.getYear(),
                                              Collectors.groupingBy(p ->p.getMonth())));
        //Converting map into string for exporting purposes
        String s = mapDateItems.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map (e ->e.getKey() +":"+ e.getValue()+"")
                .collect(joining(""));
        //giving format to this string
        s= s.replace("=", "")
                .replace(":", ":\r\n\t")
                .replace("], ", "\t-")
                .replace(")", ")\r\n")
                .replace("),", ")\r\n")
                .replace("):", ")\r\n")
                .replace("]}", "\r\n")
                .replace(",", "")
                .replace("{", "-")
                .replace("[", "\r\n")
                .replace("=[", "\r\n")
                .replace("=[", "\r\n")
                .replace("\t\n \t\t\t", "\t\t\t");
      return s;
    }
/**
* Getters and setters
*/
    public DateFormats getDateFormats() {
        return dateFormats;
    }
    public void setDateFormats(DateFormats dateFormats) {
        dateFormats = dateFormats;
    }
    public List<SimpleDateFormat> getSimpleDateFormats() {
        return simpleDateFormats;
    }
    public void setSimpleDateFormats(List<SimpleDateFormat> simpleDateFormats) {this.simpleDateFormats = simpleDateFormats;
    }
}
