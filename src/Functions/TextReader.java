package Functions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextReader {

    private String fileName;
    private String filePath;
    private String fileExt;
    private File file;
    private String text = "";

    public TextReader(){}
    public TextReader(String filePath,String fileName, String fileExt){
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileExt = fileExt;
    }
    public String fileReaderStr (){
       try {
            File file = new File(filePath + fileName+ "."+fileExt);
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
            String textLine = sc.nextLine();
            text = text + "\n"+textLine;
            }
            sc.close();

        }   catch (IOException e) { }
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
