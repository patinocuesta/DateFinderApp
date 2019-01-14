import Data.DateItem;
import Functions.ParserTool;
import Functions.TextMatcher;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.joining;

public class Main {

    public static void main(String[] args) {

        String text =
                "Marvin Lee Minsky at the Mathematics Genealogy Project; 20 May 2014\n" +
                        "\n" +
                        "Marvin Lee Minsky at the AI Genealogy Project. {reprint 18 September 2011)\n" +
                        "\n" +
                        "\"Personal page for Marvin Minsky\". web.media.mit.edu. Retrieved 23 June 2016.\n" +
                        "\n" +
                        "Admin (January 27, 2016). \"Official Alcor Statement Concerning Marvin Minsky\". \n" +
                        "\n" +
                        "\tAlcor Life Extension Foundation. Retrieved 2016-04-07.\n" +
                        "\n" +
                        "\"IEEE Computer Society Magazine Honors Artificial Intelligence Leaders\". \n" +
                        "\n" +
                        "\tDigitalJournal.com. August 24, 2011. Retrieved September 18, 2011. \n" +
                        "\n" +
                        "\tPress release source: PRWeb (Vocus).\n" +
                        "\n" +
                        "\"Dan David prize 2014 winners\". May 15, 2014. Retrieved May 20, 2014.";

        TextMatcher textMatcher = new TextMatcher();
        text = textMatcher.breakLineDelete(text);
        List<String> matches = textMatcher.matcherListing(text);
        ParserTool parserTool = new ParserTool();
        List<Date> dates = new ArrayList<Date>();
        dates = parserTool.parseListStrToListDate(matches);
        Collections.sort(dates);

        Map<Date, Integer> map = new LinkedHashMap<Date, Integer>();
        for (Date date : dates) {
            map.put(date, Collections.frequency(dates, date));}

        List<DateItem> dateItems = new ArrayList<DateItem>();
        Date dateItem;

        for (Map.Entry<Date, Integer> mapentry : map.entrySet()) {
            dateItem = mapentry.getKey();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateItem);
            dateItems.add(new DateItem(calendar.get(Calendar.YEAR),
                                       calendar.get(Calendar.MONTH) + 1,
                                       calendar.get(Calendar.DAY_OF_MONTH),
                                       mapentry.getValue()));
        }

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
            .replace(":", ":\n")
            .replace("], ", "\t\t-")
            .replace("),", ")")
            .replace("):", ")\n")
            .replace("]}", "\n")
            .replace(",", "")
            .replace("{", "\t\t-")
            .replace("[", "\n");

        System.out.println(s);
    }





}



