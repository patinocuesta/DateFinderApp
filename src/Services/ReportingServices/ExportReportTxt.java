package Services.ReportingServices;

import Services.ParserServices.TextMatcherParser;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExportReportTxt {
    private String text;
    private String file;
/*
Constructors.
*/
    public ExportReportTxt(){}
    public ExportReportTxt(String file, String text){
        this.file = file;
        this.text = text;
    }
/*
Method for generating a report.
*/
    public void generateReportTxt(String file, String text) {

        try {
            //FileWriter for creating a file and BufferedWriter for filling it.
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            //Object TextMatcherParser for giving the text format we need.
            TextMatcherParser textMatcherParser = new TextMatcherParser();
            //Writing the text.
            writer.write(textMatcherParser.stringTextToStringMultilevelList(text));
            writer.close();
            System.out.print("Report generated: " + file +"\n");
        } catch (IOException e) {System.out.print("\nError generating report.\n");}
    }
/*
Getters and Setters.
 */
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getFile() {
        return file;
    }
    public void setFile(String file) {
        this.file = file;
    }
}
