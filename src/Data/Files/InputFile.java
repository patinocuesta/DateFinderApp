package Data.Files;
/**
*Class defining a file to parsed by its path, name and extension.
 */
public class InputFile {
    private String sourceNameFile;
    private String sourceExtFile;
    private String sourcePathFile;
/**
 * Constructors.
 */
    public InputFile(){}
    public InputFile(String sourceNameFile, String sourceExtFile, String sourcePathFile ){
        this.sourceNameFile = sourceNameFile;
        this.sourceExtFile = sourceExtFile;
        this.sourcePathFile = sourcePathFile;
    }
/**
 * Getters and setters.
 */
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
/**
 * toString method.
 */
    @Override
    public String toString() {
        return "InputFile{" +
                "sourceNameFile='" + sourceNameFile + '\'' +
                ", sourceExtFile='" + sourceExtFile + '\'' +
                ", sourcePathFile='" + sourcePathFile + '\'' +
                '}';
    }
}
