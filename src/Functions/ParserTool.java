package Functions;

import Data.ParserFormats;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParserTool {
/*
Attributes
*/
    private ParserFormats parserFormats = new ParserFormats();
    private List<SimpleDateFormat> simpleDateFormats;
/*
Constructor
*/
    public ParserTool (){ }
    public ParserTool (ParserFormats parserFormats, List<SimpleDateFormat> simpleDateFormats){
    this.parserFormats = parserFormats;
    this.simpleDateFormats =  simpleDateFormats;}

    public List<Date> parseListStrToListDate(List<String> listStr) {
        simpleDateFormats = parserFormats.SimpleDateFormatListing();
        List<Date> dates = new ArrayList<Date>();
        for (String item : listStr) {
            for (SimpleDateFormat simpleDateFormat : simpleDateFormats){
                try {
                    Date date = simpleDateFormat.parse(item);
                    dates.add(date);
                    break;
                } catch (Exception e1) {
                    // e1.printStackTrace();
                }
            }
        }
        return dates;}
/*
Getters and Setters
*/
    public ParserFormats getParserFormats() {
        return parserFormats;
    }
    public void setParserFormats(ParserFormats parserFormats) {
        parserFormats = parserFormats;
    }
    public List<SimpleDateFormat> getSimpleDateFormats() {
        return simpleDateFormats;
    }
    public void setSimpleDateFormats(List<SimpleDateFormat> simpleDateFormats) {this.simpleDateFormats = simpleDateFormats;}
}
