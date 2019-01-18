package Services.ImportServices;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ImportFile {

    private String text;

    public ImportFile() { }

    public String fileReaderStr(File file, String extension) throws IOException {


        if (extension.equals("txt")) {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String textLine = sc.nextLine();
                text = text + "\n" + textLine;
            }
            sc.close();

        } else if (extension.equals("pdf")) {

            //Loading an existing document
            PDDocument document = PDDocument.load(file);
            //Instantiate PDFTextStripper class
            PDFTextStripper pdfStripper = new PDFTextStripper();
            //Retrieving text from PDF document
            String textRaw = pdfStripper.getText(document);
            String lines[] = textRaw.split("\\r?\\n");
            for (String line : lines) {
                text = text + line;
            }
            //Closing the document
            // document.close();


        } else {
            System.out.print("Error generating this rapport.\nContact le service support\nClosing\n");
            System.exit(0);
        }
        return text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
