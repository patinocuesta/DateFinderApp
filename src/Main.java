import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {


    public static void main(String[] args) {


        String text =
                "Marvin Lee Minsky at the Mathematics Genealogy Project; 20 May 2014\n" +
                        "\n" +
                        "Marvin Lee Minsky at the AI Genealogy Project.{reprint 18 September 2011)\n" +
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

        String patternString;
        //Pattern made using https://regexr.com/ as reference
        patternString = "((January|Jan|February|Feb|March|Mar|April|Apr|May|June|Jun|July|Jul|August|Aug|September|Sep|Sept|October|Oct|November|Nov|December|Dec)\\s\\d{1,2}\\W{1,2}\\d{4})" +
                "|(\\d{1,2}\\s(January|Jan|February|Feb|March|Mar|April|Apr|May|June|Jun|July|Jul|August|Aug|September|Sep|Sept|October|Oct|November|Nov|December|Dec)\\s\\d{4})" +
                "|(\\d{1,2}(/|-)\\d{1,2}(/|-)\\d{2,4})" +
                "|(\\d{2,4}(/|-)\\d{1,2}(/|-)\\d{1,2})";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        ArrayList<Date> dateList =new ArrayList<>();
        while (matcher.find()) {Date date = tryParse(matcher.group());
                            dateList.add(date);
        }
        Collections.sort(dateList);
        dateList.forEach(
                (date -> System.out.println(
                        "(" +  (date.toString().substring(date.toString().length()-4, date.toString().length()))+")"
                        + "(" + (date.toString().substring(4, 7))+")"
                                + "(" + (date.toString().substring(8, 10))+")"
                )));

    }

    public static Date tryParse (String dateStr) {
        DateFormat dateFormat1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        DateFormat dateFormat2 = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        DateFormat dateFormat3 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = null;
        while (date == null) {
            try {
                date = dateFormat1.parse(dateStr);
            } catch (ParseException e) {
              //  e.printStackTrace();
            }

            try {
                date = dateFormat2.parse(dateStr);
            } catch (ParseException e) {
             //   e.printStackTrace();
            }

            try {
                date = dateFormat3.parse(dateStr);
            } catch (ParseException e) {
             //   e.printStackTrace();
            }
        }
        return date;
    }
}

