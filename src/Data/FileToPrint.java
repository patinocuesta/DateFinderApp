package Data;

public class FileToPrint {
    private String destinationNameFile;
    private String destinationExtFile;
    private String destinationPathFile;

    public FileToPrint (){}
    public FileToPrint (String destinationNameFile,String destinationExtFile, String destinationPathFile ){
        this.destinationNameFile = destinationNameFile;
        this.destinationExtFile = destinationExtFile;
        this.destinationPathFile = destinationPathFile;
    }

    public String getDestinationNameFile() {
        return destinationNameFile;
    }
    public void setDestinationNameFile(String destinationNameFile) {
        this.destinationNameFile = destinationNameFile;
    }
    public String getDestinationExtFile() {
        return destinationExtFile;
    }
    public void setDestinationExtFile(String destinationExtFile) {
        this.destinationExtFile = destinationExtFile;
    }
    public String getDestinationPathFile() {
        return destinationPathFile;
    }
    public void setDestinationPathFile(String destinationPathFile) {
        this.destinationPathFile = destinationPathFile;
    }

    @Override
    public String toString() {
        return "FileToPrint{" +
                "destinationNameFile='" + destinationNameFile + '\'' +
                ", destinationExtFile='" + destinationExtFile + '\'' +
                ", destinationPathFile='" + destinationPathFile + '\'' +
                '}';
    }
}
