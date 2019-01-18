package Services.ReportingServices;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.File;
import java.io.IOException;

public class ExportReportPdf {

    private String text;
    private File file;

   public ExportReportPdf(){}

   public File createPdf() {
       //Creating PDF document object
       PDDocument document = new PDDocument();

       for (int i=0; i<10; i++) {
           //Creating a blank page
           PDPage blankPage = new PDPage();

           //Adding the blank page to the document
           document.addPage( blankPage );
       }

       try {
           //Saving the document
           document.save("\\C:\\Users\\"+ System.getProperty("user.name")+ "\\Desktop\\Report.pdf");
           File file = new File("\\C:\\Users\\"+ System.getProperty("user.name")+ "\\Desktop\\Report.pdf");
       //Closing the document
       document.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
       return file;
   }

    public void writePdf(File file, String text) throws IOException {
      //  createPdf();
    //Loading an existing document
   // File file = new File("\\C:\\Users\\"+ System.getProperty("user.name")+ "\\Desktop\\Report.pdf");

            System.out.print(file);
            PDDocument doc = PDDocument.load(file);
        System.out.print(text);
            //Creating a PDF Document
            PDPage page = doc.getPage(1);

            PDPageContentStream contentStream = new PDPageContentStream(doc, page);

            //Begin the Content stream
            contentStream.beginText();

            //Setting the font to the Content stream
            contentStream.setFont(PDType1Font.TIMES_ROMAN, 16);

            //Setting the leading
            contentStream.setLeading(14.5f);

            //Setting the position for the line
            contentStream.newLineAtOffset(25, 725);
/*
    String text1 = "This is an example of adding text to a page in the pdf document.
    we can add as many lines";
    String text2 = "as we want like this using the ShowText()  method of the
    ContentStream class";
*/
            //Adding text in the form of string
            contentStream.showText(text);
            contentStream.newLine();
            //contentStream.showText(text2);
            //Ending the content stream
            contentStream.endText();

            System.out.println("Content added");

            //Closing the content stream
            contentStream.close();

            //Saving the document
           doc.save(new File("C:/PdfBox_Examples/new.pdf"));

            //Closing the document
            doc.close();

}



    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }
}




