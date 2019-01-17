package Services.RegexMatchers;

import Data.Files.InputFile;
import Data.Files.OutputFile;
import java.util.Scanner;

public class ExtMatcher {
    private static final String regexInput = "([A-Za-z0-9]+)";
    private String input;

    public ExtMatcher(){}
    public ExtMatcher(String input){
        this.input = input;
    }
    public void inputFileExtValidator (InputFile inputFile) {
        validationLoop();
        inputFile.setSourceExtFile(input);
        System.out.println("File name : " + inputFile.getSourceExtFile() + "\n");
    }
    public void outputFileExtValidator (OutputFile outputFile) {
        validationLoop();
        outputFile.setDestinationExtFile(input);
        System.out.println("File name : " + outputFile.getDestinationExtFile() + "\n");
    }

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
