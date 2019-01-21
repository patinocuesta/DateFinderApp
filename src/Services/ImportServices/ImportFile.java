package Services.ImportServices;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
* Class defining a file to be imported by its content and its path-name-ext
*/
public class ImportFile {

    private String text;
    private String file;
/**
* Constructor
*/
    public ImportFile() { }
/**
Importing method according to file and its extension.
*/
    public String fileReaderStr(File file, String extension) throws IOException {
/**
Control extension: if txt importing by Scanner object, if pdf importing with Pdfbox.
*/
        if (extension.equals("txt")) {
            Scanner sc = new Scanner(file);
            //Retrieving text and lines iteration for importing
            while (sc.hasNext()) {
                String textLine = sc.nextLine();
                text = text + "\n" + textLine;
            }
            //Scanner close
            sc.close();
        } else if (extension.equals("pdf")) {
            //Loading an existing document
            PDDocument document = PDDocument.load(file);
            //Instantiate PDFTextStripper class
            PDFTextStripper pdfStripper = new PDFTextStripper();
            //Retrieving text from PDF document
            String textRaw = pdfStripper.getText(document);
            //lines iteration for importing
            String lines[] = textRaw.split("\\r?\\n");
            for (String line : lines) {
                text = text + line;
            }
            //document close
            document.close();
        } else {
            //Error warning and exit application
            System.out.print("Error importing file.\nContact le service support\nClosing\n");
            System.exit(0);
        }
        return text;
    }
/**
* Getters and setters.
*/
    public String getFile() {
        return file;
    }
    public void setFile(String file) {
        this.file = file;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
