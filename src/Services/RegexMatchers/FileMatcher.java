package Services.RegexMatchers;

import Data.Files.InputFile;
import Data.Files.OutputFile;
import java.util.Scanner;
/**
 * Class for approving file name according to a regex expression.
 */
public class FileMatcher {

    private static final String regexInput = "([A-Za-z0-9\\-_\\.\\s]+)";
    private String input;
    /**
     * Constructors
     */
    public FileMatcher(){}
    public FileMatcher(String input){
        this.input = input;
    }
    /**
     * Method for validating the file name in a input file
     * @param inputFile
     */
    public void inputFileNameValidator (InputFile inputFile) {
            inputFile.setSourceNameFile(validationLoop());
            System.out.println("File name : " + inputFile.getSourceNameFile() + "\n");
    }
    /**
     * Method for validating the file name in a output file
     * @param outputFile
     */
    public void outputFileNameValidator (OutputFile outputFile){
            outputFile.setDestinationNameFile(validationLoop());
            System.out.println("File name : " + outputFile.getDestinationNameFile() + "\n");
    }
    /**
     * Loop until validation
     * @return
     */
    private String  validationLoop() {
               Scanner scanner = new Scanner(System.in);
               System.out.print("Enter file name : ");
            input = scanner.nextLine();
               while (input.isEmpty() || !input.matches(regexInput)) {
                   System.out.print("Error. Special character found or empty name. Try again:");
                   Scanner scannerLoop = new Scanner(System.in);
                   input = scannerLoop.nextLine();
               }
    return input;
    }
    /**
     * Getters and setters
     * @return
     */
    public static String getRegexInput() {
        return regexInput;
    }
    public String getInput() {
        return input;
    }
}
