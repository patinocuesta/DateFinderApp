package Functions;

import Data.DateItem;
import Data.ParserFormats;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.joining;

public class ParserTool {
/*
Attributes
*/
    private ParserFormats parserFormats = new ParserFormats();
    private List<SimpleDateFormat> simpleDateFormats;
/*
Constructor
*/
    public ParserTool (){ }
    public ParserTool (ParserFormats parserFormats, List<SimpleDateFormat> simpleDateFormats){
    this.parserFormats = parserFormats;
    this.simpleDateFormats =  simpleDateFormats;}
/*
Method for parsing a String list into Dates list
 */
    public List<Date> parseListStrToListDate(List<String> listStr) {
        simpleDateFormats = parserFormats.SimpleDateFormatListing();
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
/*
Method for formatting a Dates list with default format
 */
    public  List<DateItem> formatListToMap (List<Date> dates){
//creo mapa con fechas para eliminar dupliados de la lista dates
        Map<Date, Integer> map = new LinkedHashMap<Date, Integer>();
//mapeo la lista
            for (Date date : dates) {
            map.put(date, Collections.frequency(dates, date));}
//Paso a dar formato Date definitivo en una lista de objetos DateItem
        List<DateItem> dateItems = new ArrayList<DateItem>();
        Date dateItem;
//Formato obtenido con el uso de la clase Calendar
            for (Map.Entry<Date, Integer> mapentry : map.entrySet()) {
            dateItem = mapentry.getKey();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateItem);
            dateItems.add(new DateItem(calendar.get(Calendar.YEAR),
                                       calendar.get(Calendar.MONTH) + 1,
                                       calendar.get(Calendar.DAY_OF_MONTH),
                                       mapentry.getValue()));}

            return dateItems;}

    public String  ListToMultilevelMapToString (List<DateItem> dateItems){
        Map<Integer, Map<Integer, List<DateItem>>> mapDateItems=dateItems
                .stream()
                .collect(
                        Collectors.groupingBy(p ->p.getYear(),
                                              Collectors.groupingBy(p ->p.getMonth())));

        String s = mapDateItems.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map (e ->e.getKey() +":"+ e.getValue()+"")
                .collect(joining(""));

        s= s.replace("=", "")
                .replace(":", ":\r\n\t")
                .replace("], ", "\t-")
                .replace(")", ")\r\n")
                .replace("),", ")\r\n")//este  no
                .replace("):", ")\r\n")
                .replace("]}", "\r\n")//este no
                .replace(",", "")
                .replace("{", "-")
                .replace("[", "\r\n")
                .replace("=[", "\r\n")//este no
                .replace("=[", "\r\n")//este no
                .replace("\t\n \t\t\t", "\t\t\t");


      return s;
    }
    /*
    Getters and Setters
    */
    public ParserFormats getParserFormats() {
        return parserFormats;
    }
    public void setParserFormats(ParserFormats parserFormats) {
        parserFormats = parserFormats;
    }
    public List<SimpleDateFormat> getSimpleDateFormats() {
        return simpleDateFormats;
    }
    public void setSimpleDateFormats(List<SimpleDateFormat> simpleDateFormats) {this.simpleDateFormats = simpleDateFormats;}
}
