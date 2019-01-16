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
/*
Constructors
*/
    public TextMatcherParser() {}
    public TextMatcherParser(TextMatcher textMatcher, ParserTool parserTool) {
        this.textMatcher = textMatcher;
        this.parserTool = parserTool;}

    public String stringTextToStringMultilevelList(String text) {
    TextMatcher textMatcher = new TextMatcher();
    text = textMatcher.breakLineDelete(text);
    List<String> matches = textMatcher.matcherListing(text);
    ParserTool parserTool = new ParserTool();
    List<Date> dates = parserTool.parseListStrToListDate(matches);
    List<DateItem> dateItems = parserTool.formatListToMap(dates);
    String s = parserTool.ListToMultilevelMapToString(dateItems);
    if( (s == null)||(s=="") ){
        s= "no date found in this text.\nParse another document.";
    }
    return s;}
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

