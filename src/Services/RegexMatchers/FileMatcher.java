package Services.RegexMatchers;

import Data.Files.InputFile;
import Data.Files.OutputFile;

import java.util.Scanner;

public class FileMatcher {

    private static final String regexInput = "([A-Za-z0-9\\-_\\.\\s]+)";
    private String input;

    public FileMatcher(){}
    public FileMatcher(String input){
        this.input = input;
    }
    public void inputFileNameValidator (InputFile inputFile) {
            validationLoop();
            inputFile.setSourceNameFile(input);
            System.out.println("File name : " + inputFile.getSourceNameFile() + "\n");
    }
    public void outputFileNameValidator (OutputFile outputFile){
            validationLoop();
            outputFile.setDestinationNameFile(input);
            System.out.println("File name : " + outputFile.getDestinationNameFile() + "\n");
    }
    public String  validationLoop() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter file name : ");
            input = scanner.nextLine();
            while (input.isEmpty() || !input.matches(regexInput)) {
            System.out.print("Error. Special character found or empty name. Try again:");
            input = scanner.nextLine();
            }
        } catch (Exception e) {}
        return input;
    }
    public static String getRegexInput() {
        return regexInput;
    }
    public String getInput() {
        return input;
    }
}
