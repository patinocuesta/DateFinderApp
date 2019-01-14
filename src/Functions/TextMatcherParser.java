package Functions;

import Data.DateItem;
import java.util.Date;
import java.util.List;

public class TextMatcherParser {
    /*
    Attributes
    */
    private TextMatcher textMatcher;
    private ParserTool parserTool;
    String s;
    /*
    Constructors
    */
    public TextMatcherParser() {
    }

    public TextMatcherParser(TextMatcher textMatcher, ParserTool parserTool) {
        this.textMatcher = textMatcher;
        this.parserTool = parserTool;
    }

    public String stringTextToStringMultilevelList(String text) {
        if (text != null) {
try {
    text = textMatcher.breakLineDelete(text);
    List<String> matches = textMatcher.matcherListing(text);
    List<Date> dates = parserTool.parseListStrToListDate(matches);
    List<DateItem> dateItems = parserTool.formatListToMap(dates);
    s = parserTool.ListToMultilevelMapToString(dateItems);
    }catch (Exception e1){}
        } else {s="error";}
        return s;
    }

    /*
    Getters and Setters
    */

    public TextMatcher getTextMatcher() {
        return textMatcher;
    }

    public void setTextMatcher(TextMatcher textMatcher) {
        this.textMatcher = textMatcher;
    }

    public ParserTool getParserTool() {
        return parserTool;
    }

    public void setParserTool(ParserTool parserTool) {
        this.parserTool = parserTool;
    }
}

