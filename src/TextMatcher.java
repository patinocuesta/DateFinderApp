import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextMatcher {

    private String patternString;
    private List<String> listStr = new ArrayList<String>();

public TextMatcher () {

    patternString = "((January|Jan|February|Feb|March|Mar|April|Apr|May|June|Jun|July|Jul|August|Aug|September|Sep|Sept|October|Oct|November|Nov|December|Dec)\\s\\d{1,2}\\W{1,2}\\d{4})" +
            "|(\\d{1,2}\\s(January|Jan|February|Feb|March|Mar|April|Apr|May|June|Jun|July|Jul|August|Aug|September|Sep|Sept|October|Oct|November|Nov|December|Dec)\\s\\d{4})" +
            "|(\\d{1,2}(/|-)\\d{1,2}(/|-)\\d{2,4})" +
            "|(\\d{2,4}(/|-)\\d{1,2}(/|-)\\d{1,2})";

}
    public List<String> matcherListing(String text){
        listStr = null;
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
            String Item = (matcher.group());
          listStr.add(Item);

        }
       return  listStr;
    }

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



