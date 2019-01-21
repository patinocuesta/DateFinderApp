package Services.RegexMatchers;

import Data.Files.InputFile;
import Data.Files.OutputFile;
import java.util.Scanner;
/**
 * Class for approving file extension according to a regex expression.
 */
public class ExtMatcher {
    private static final String regexInput = "([A-Za-z0-9]+)";
    private String input;
/**
 * Constructors
 */
    public ExtMatcher(){}
    public ExtMatcher(String input){
        this.input = input;
    }
/**
 * Method for validating the extension in a input file
 * @param inputFile
 */
    public void inputFileExtValidator (InputFile inputFile) {
        validationLoop();
        inputFile.setSourceExtFile(input);
        System.out.println("File name : " + inputFile.getSourceExtFile() + "\n");
    }
/**
 * Method for validating the extension in a output file
 * @param outputFile
 */
    public void outputFileExtValidator (OutputFile outputFile) {
        validationLoop();
        outputFile.setDestinationExtFile(input);
        System.out.println("File name : " + outputFile.getDestinationExtFile() + "\n");
    }
/**
 * Loop until validation
 * @return
 */
    public String  validationLoop() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter extension : ");
            input = scanner.nextLine();
            while (input.isEmpty() || !input.matches(regexInput)) {
                System.out.print("Error. Special character found or empty extension. Try again:");
                input = scanner.nextLine();
            }
        } catch (Exception e) {}
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
    public void setInput(String input) {
        this.input = input;
    }
}
