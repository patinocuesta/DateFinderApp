package Services.RegexMatchers;

import Data.Files.InputFile;
import Data.Files.OutputFile;

import java.util.Scanner;

public class PathMatcher {
    private static final String regexInput = "([A-Za-z0-9\\\\:]+)";
    private String input;

    public PathMatcher(){}
    public PathMatcher(String input){
        this.input = input;
    }
    public void inputFilePathValidator (InputFile inputFile) {
        validationLoop();
        input = input.replace("\\","\\\\");
        inputFile.setSourcePathFile(input);
        input = input.replace("\\\\","\\");
        System.out.println("Path : " + inputFile.getSourcePathFile() + "\n");
    }
    public void outputFilePathValidator (OutputFile outputFile) {
        validationLoop();
        input = input.replace("\\","\\\\");
        outputFile.setDestinationPathFile(input);
        input = input.replace("\\\\","\\");
        System.out.println("Path : " + outputFile.getDestinationPathFile() + "\n");
    }

    public String  validationLoop() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter path file : ");
            input = scanner.nextLine();
            while (input.isEmpty() || !input.matches(regexInput)) {
                System.out.print("Error. Special character found or empty path. Try again:");
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
