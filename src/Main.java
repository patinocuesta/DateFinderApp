import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        String patternString;
        patternString = "(\\d{1,2}-\\d{1,2}-\\d{4})" +
                        "|(\\d{1,2}/\\d{1,2}/\\d{4})" +
                        "|(\\d{4}-\\d{2}-\\d{2})" +
                        "|(\\d{4}/\\d{1,2}/\\d{1,2})" +
                        "|(\\d{1,2}/(?i)(January|February|March|April|May|June|July|August|September|October|November|December)/\\d{4})" +
                        "|(\\d{1,2}-(?i)(January|February|March|April|May|June|July|August|September|October|November|December)-\\d{4})" +
                        "|(\\d{1,2} (?i)(January|February|March|April|May|June|July|August|September|October|November|December) \\d{4})" +
                        "|((January|February|March|April|May|June|July|August|September|October|November|December)\\d{1,2},\\d{4})";

        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end()
                    + " --> " + pattern.matcher(text));
        }
    }

}