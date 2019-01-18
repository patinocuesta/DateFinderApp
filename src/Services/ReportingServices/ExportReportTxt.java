package Services.ReportingServices;

import Services.ParserServices.TextMatcherParser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExportReportTxt {


    public ExportReportTxt(){}

    public void generateReportTxt(String text, File file) {

        try {
           // System.out.print("\nestoy en generate txt");
           // System.out.print("\nOtra prueba texto: " + text);
            FileWriter fileWriter = new FileWriter(file);
           // System.out.print("\nDespues filewriter");
            BufferedWriter writer = new BufferedWriter(fileWriter);
           // System.out.print("\nDespues textMatcher");
            TextMatcherParser textMatcherParser = new TextMatcherParser();
            writer.write(textMatcherParser.stringTextToStringMultilevelList(text));
            writer.close();
        } catch (IOException e) { }
            //System.out.print("\njjjaaallll")

        }
    }

