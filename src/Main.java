import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;


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

        while (matcher.find()) {

            Date date = tryParse(matcher.group());
            System.out.println("found: " + date + " : " + " --> " + matcher.group());
        }

    }

    public static Date tryParse(String dateString) {
        Date date = null;
        //List<String> formatStrings = Arrays.asList("d M y", "M d, yyyy", "MMM-dd-yyyy");
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format2 = new SimpleDateFormat("MMM dd, yyyy");
        SimpleDateFormat format3 = new SimpleDateFormat("dd MMM yyyy");
        //SimpleDateFormat format4 = new SimpleDateFormat("yyyy-MM-dd");

            try {

                      date =  format1.parse(dateString);
                        if (date == null) {
                            date = format2.parse(dateString);
                            if (date == null) {
                                date = format3.parse(dateString);
                            }
                        }


            } catch (ParseException e) {
            }


        return date;
    }

}

