package Services.ReportingServices;

import Services.ParserServices.TextMatcherParser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExportReportTxt {


    public ExportReportTxt(){}

    public void generateReportTxt(String text) {
        TextMatcherParser textMatcherParser = new TextMatcherParser();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(text));
            writer.write(textMatcherParser.stringTextToStringMultilevelList(text));
            writer.close();
        } catch (
                IOException e) {
        }
    }
}
