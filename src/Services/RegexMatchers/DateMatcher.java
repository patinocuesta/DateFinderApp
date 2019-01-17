package Services.RegexMatchers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMatcher {
/*
Attributes
*/
    private String patternString;
    private List<String> listStr = new ArrayList<String>();
    private String listStrItem;
/*
Constructors
*/
    public DateMatcher() {
        patternString = "((January|Jan|February|Feb|March|Mar|April|Apr|May|June|Jun|July|Jul|August|Aug|September|Sep|Sept|October|Oct|November|Nov|December|Dec)\\s\\d{1,2}\\W{0,2}\\d{4})" +
                "|(\\d{1,2}\\s(January|Jan|February|Feb|March|Mar|April|Apr|May|June|Jun|July|Jul|August|Aug|September|Sep|Sept|October|Oct|November|Nov|December|Dec)\\s\\d{4})" +
                "|(\\d{1,2}(/|-)\\d{1,2}(/|-)\\d{2,4})" +
                "|(\\d{2,4}(/|-)\\d{1,2}(/|-)\\d{1,2})";}

    public List<String> matcherListing(String text){
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
            int i=0;
            while (matcher.find()) {
                listStrItem = (matcher.group());
                listStr.add(listStrItem);
                i++;}
        return  listStr;
    }

    public String breakLineDelete(String text) {
        return text.replaceAll("\n", " ");}
/*
Getters and Setters
*/
    public String getPatternString() {
        return patternString;
    }
    public void setPatternString(String patternString) {
        this.patternString = patternString;
    }
    public List<String> getListStr() {
        return listStr;
    }
    public void setListStr(List<String> listStr) {
        this.listStr = listStr;
    }
}
