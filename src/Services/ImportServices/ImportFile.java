package Services.ImportServices;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ImportFile {

    private String fileName;
    private String filePath;
    private String fileExt;
    private File file;
    private String text = "";

    public ImportFile(){}
    public ImportFile(String filePath, String fileName, String fileExt){
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileExt = fileExt;
    }
    public String fileReaderStr (){
       try {
            File file = new File(filePath + fileName+ "."+fileExt);
            if (fileExt.equals("txt")) {
                Scanner sc = new Scanner(file);
                while (sc.hasNext()) {
                    String textLine = sc.nextLine();
                    text = text + "\n" + textLine;
                }
                sc.close();
            }else if (fileExt.equals("pdf")){
                //Loading an existing document
                PDDocument document = PDDocument.load(file);
                //Instantiate PDFTextStripper class
                PDFTextStripper pdfStripper = new PDFTextStripper();
                //Retrieving text from PDF document
                String textRaw = pdfStripper.getText(document);
                String lines[] = textRaw.split("\\r?\\n");
                for (String line : lines) {
                    text = text +line;
                }
                //Closing the document
                document.close();
           }else{System.out.print("Error generating this rapport.\nContact le service support\nClosing\n");
                System.exit(0);
           }

        } catch (IOException e) {}
       return text;
    }

    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getFileExt() {
        return fileExt;
    }
    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }
}
