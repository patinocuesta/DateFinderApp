package Services.ParserServices;

import Data.Dates.DateItem;
import Services.RegexMatchers.DateMatcher;
import java.util.Date;
import java.util.List;
/**
* Class defining un item joining a list of formats for dates and the object
 * including the methods for parsing a text according to these formats.
*/
public class TextMatcherParser {
    private DateMatcher dateMatcher;
    private ParserTool parserTool;
/**
* Constructors
*/
    public TextMatcherParser() {}
    public TextMatcherParser(DateMatcher dateMatcher, ParserTool parserTool) {
        this.dateMatcher = dateMatcher;
        this.parserTool = parserTool;
    }
/**
 * Method for getting from a given string another string containing every date detected
 * @param text
 * @return
 */
    public String stringTextToStringMultilevelList(String text) {
        DateMatcher dateMatcher = new DateMatcher();
            text = dateMatcher.breakLineDelete(text);
                List<String> matches = dateMatcher.matcherListing(text);
                    ParserTool parserTool = new ParserTool();
            List<Date> dates = parserTool.parseListStrToListDate(matches);
                List<DateItem> dateItems = parserTool.formatListToMap(dates);
                    String s = parserTool.ListToMultilevelMapToString(dateItems);
                        if((s == null)||(s.equals(""))){
                            s= "no date found in this text.\nParse another document.";
                        }
        return s;
    }
/**
*Getters and setters
*/
    public DateMatcher getDateMatcher() {
        return dateMatcher;
    }
    public void setDateMatcher(DateMatcher dateMatcher) {
        this.dateMatcher = dateMatcher;
    }
    public ParserTool getParserTool() {
        return parserTool;
    }
    public void setParserTool(ParserTool parserTool) {
        this.parserTool = parserTool;
    }
}

