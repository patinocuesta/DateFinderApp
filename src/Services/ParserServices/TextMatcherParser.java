package Services.ParserServices;

import Data.Dates.DateItem;
import Services.RegexMatchers.DateMatcher;

import java.util.Date;
import java.util.List;

public class TextMatcherParser {
/*
Attributes
*/
    private DateMatcher dateMatcher;
    private ParserTool parserTool;
/*
Constructors
*/
    public TextMatcherParser() {}
    public TextMatcherParser(DateMatcher dateMatcher, ParserTool parserTool) {
        this.dateMatcher = dateMatcher;
        this.parserTool = parserTool;}

    public String stringTextToStringMultilevelList(String text) {
    DateMatcher dateMatcher = new DateMatcher();
    text = dateMatcher.breakLineDelete(text);
    List<String> matches = dateMatcher.matcherListing(text);
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

