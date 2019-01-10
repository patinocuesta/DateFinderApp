
import java.util.*;

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

       TextMatcher textMatcher = new TextMatcher();
       List<String> matches = textMatcher.matcherListing(text);
       ParserTool parserTool = new ParserTool();
       List<Date> dates = new ArrayList<Date>();
       dates = parserTool.parseListStrToListDate(matches);

       for (String match : matches) {
          System.out.println(match);
      }
        for (Date date : dates) {
            System.out.println(date);
        }
    }
}

