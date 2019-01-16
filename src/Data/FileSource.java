package Data;

public class FileSource {
    private String sourceNameFile;
    private String sourceExtFile;
    private String sourcePathFile;


    public FileSource (){}
    public FileSource (String sourceNameFile,String sourceExtFile, String sourcePathFile ){
        this.sourceNameFile = sourceNameFile;
        this.sourceExtFile = sourceExtFile;
        this.sourcePathFile = sourcePathFile;
    }

    public String getSourceNameFile() {
        return sourceNameFile;
    }
    public void setSourceNameFile(String sourceNameFile) {
        this.sourceNameFile = sourceNameFile;
    }
    public String getSourceExtFile() {
        return sourceExtFile;
    }
    public void setSourceExtFile(String sourceExtFile) {
        this.sourceExtFile = sourceExtFile;
    }
    public String getSourcePathFile() {
        return sourcePathFile;
    }
    public void setSourcePathFile(String sourcePathFile) {
        this.sourcePathFile = sourcePathFile;
    }

    @Override
    public String toString() {
        return "FileSource{" +
                "sourceNameFile='" + sourceNameFile + '\'' +
                ", sourceExtFile='" + sourceExtFile + '\'' +
                ", sourcePathFile='" + sourcePathFile + '\'' +
                '}';
    }
}
