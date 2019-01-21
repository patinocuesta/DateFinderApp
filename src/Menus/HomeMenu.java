package Menus;

import Data.Files.InputFile;
import Data.Files.OutputFile;
import Services.RegexMatchers.FileMatcher;
import Services.RegexMatchers.ExtMatcher;
import Services.RegexMatchers.PathMatcher;

import Services.ReportingServices.ExportReportTxt;
import Services.ParserServices.TextMatcherParser;
import Services.ImportServices.ImportFile;
import Menus.MenuModel.Menu;
import Menus.MenuModel.MenuOption;

import java.io.*;
import java.util.Scanner;

/**
 * Class defining IHM including 2 menu and several submenus with the actions to be done
 */
public class HomeMenu {
    private Menu mainMenu= new Menu();
    private Menu subMenu1= new Menu(1);
    private Menu subMenu2= new Menu(2);
    private InputFile inputFile = new InputFile("PresidentsList","pdf","C:\\Users\\"+ System.getProperty("user.name")+"\\Desktop\\");
    private OutputFile outputFile = new OutputFile("Presidents","txt","C:\\Users\\"+ System.getProperty("user.name")+"\\Desktop\\");
/**
 * Constructor
 */
    public HomeMenu() {}
/**
* Method for starting the menu
*/
     public void  homeMenuStart() {
         System.out.println("**************");
         System.out.println("* DateFinder *");
         System.out.println("**************\n");
         //Options in Submenu for parsing a file. This batch will define input and output file from our application.
         subMenu1.add(new MenuOption("1","Edit source file  name"+"\n\t\t Current file name: "+ inputFile.getSourceNameFile()){
             @Override
             public void doAction() {
                 FileMatcher fileMatcherInput = new FileMatcher();
                 fileMatcherInput.inputFileNameValidator(inputFile);
                 this.setMenuLine("Edit source file  name" + "\n\t\t Current file name: " + inputFile.getSourceNameFile());
             }
         });
         subMenu1.add(new MenuOption("2","Edit source file extension (txt or pdf)"+"\n\t\t Current file extension: "+ inputFile.getSourceExtFile()){
             @Override
             public void doAction() {
                 ExtMatcher extMatcherInput = new ExtMatcher();
                 extMatcherInput.inputFileExtValidator(inputFile);
                 this.setMenuLine("Edit source file extension"+"\n\t\t Current file extension: "+ inputFile.getSourceExtFile());
             }
         });
         subMenu1.add(new MenuOption("3","Edit source file  path"+"\n\t\t Current file path: "+ inputFile.getSourcePathFile()){
            @Override
             public void doAction() {
                PathMatcher pathMatcherInput = new PathMatcher();
                pathMatcherInput.inputFilePathValidator(inputFile);
                this.setMenuLine("Edit source file  path"+"\n\t\t Current file path: "+ inputFile.getSourcePathFile());
            }
         });
         subMenu1.add(new MenuOption("4","Edit output file name"+"\n\t\t Current file name: "+ outputFile.getDestinationNameFile()){
             @Override
             public void doAction() {
                 FileMatcher fileMatcherOutput = new FileMatcher();
                 fileMatcherOutput.outputFileNameValidator(outputFile);
                 this.setMenuLine("Edit source file  name"+"\n\t\t Current file name: "+ outputFile.getDestinationNameFile());
             }
         });
         subMenu1.add(new MenuOption("5","Edit output file extension(only txt available  by now)"+"\n\t\t Current file extension: "+ outputFile.getDestinationExtFile()){
             @Override
             public void doAction() {
                 System.out.print("Only txt available by now.\n");
                 this.setMenuLine("Edit output file  extension"+"\n\t\t Current file extension: "+ outputFile.getDestinationExtFile());
             }
         });
         subMenu1.add(new MenuOption("6","Edit output file path"+"\n\t\t Current file path: "+ outputFile.getDestinationPathFile()){
             @Override
             public void doAction() {
                 PathMatcher pathMatcherOutput = new PathMatcher();
                 pathMatcherOutput.outputFilePathValidator(outputFile);
                 this.setMenuLine("Edit output file  path"+"\n\t\t Current file path: "+ outputFile.getDestinationPathFile());
             }
         });
         //Option for starting input/output file process from submenu parsing a file. Exit once completed.
         subMenu1.add(new MenuOption("+","Go and get it!") {
             @Override
             public void doAction() {
                 try {
                     ImportFile importFile = new ImportFile();
                     File file = new File(inputFile.getSourcePathFile() + inputFile.getSourceNameFile() +"."+ inputFile.getSourceExtFile());
                     String text = importFile.fileReaderStr(file,inputFile.getSourceExtFile());
                     TextMatcherParser textMatcherParser = new TextMatcherParser();
                     String OutputTextInFile = textMatcherParser.stringTextToStringMultilevelList(text);
                     ExportReportTxt exportReportTxt = new ExportReportTxt();
                     exportReportTxt.generateReportTxt(outputFile.getDestinationPathFile()
                             + outputFile.getDestinationNameFile()
                             + "." + outputFile.getDestinationExtFile()
                             , OutputTextInFile);
                     System.out.print("Have a nice day!");
                     System.exit(0);
                 } catch (IOException e) {
                 }
             }
         });
         //End options in Submenu for parsing a file.
         //Options in Submenu for asking the user for a text to be parsed
         subMenu2.add(new MenuOption("1","Enter your text") {
             @Override
             public void doAction() {
                 try {
                     System.out.println("Enter or paste the text to be parsed.\n => ['$$$' + Enter] for ending capture:\n");
                     String text = "";
                     Scanner sc = new Scanner(System.in);
                     while (sc.hasNextLine()) {
                         String textLine = sc.nextLine();
                         if (textLine.contains("$$$")) break;
                         text = text + "\n" + textLine;
                     }
                     System.out.println("\n************************************************************");
                     TextMatcherParser textMatcherParser = new TextMatcherParser();
                     String OutputText = textMatcherParser.stringTextToStringMultilevelList(text);
                     System.out.println("************************************************************\n");
                     System.out.println(OutputText);
                     System.out.println("----------------------------------------------");
                     // Choice for exporting results in a txt file. Default param for this report.
                     System.out.print("Export report (Y/N):\n");
                     String input = sc.nextLine().toUpperCase();
                        if (input.equals("Y")) {
                             ExportReportTxt exportReportTxt = new ExportReportTxt();
                             exportReportTxt.generateReportTxt("\\C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\"
                                                                       + "reportDates"
                                                                       + "." + "txt", OutputText);
                             System.out.println("Have a nice day!");
                             System.exit(0);
                         } else if (input.equals("N"))  {
                             System.out.print("\nClosing application.");
                             System.out.println("\nHave a nice day!");
                             System.exit(0);
                         } else {
                            System.out.print("\nOnly Y/N permitted.");
                            System.out.print("\nClosing application.");
                            System.out.println("\nHave a nice day!");
                            System.exit(0);
                        }
                 }catch (Exception e) {}
             }
         });
         //Main menu when starting
         mainMenu.add(new MenuOption("1","Parse a document stored in your computer") {
             @Override
             public void doAction() {
                 subMenu1.loopUntilExit();
             }
         });
         mainMenu.add(new MenuOption("2","Parse an input text") {
             @Override
             public void doAction() {
                  subMenu2.loopUntilExit();
             }
         });
         //Loop method from class Menu for keeping menu back till exit.
         mainMenu.loopUntilExit();
     }
/**
* Getters and setters.
*/
        public Menu getMainMenu() {
            return mainMenu;
        }
        public void setMainMenu(Menu mainMenu) {
            this.mainMenu = mainMenu;
        }
        public Menu getSubMenu1() {
            return subMenu1;
        }
        public void setSubMenu1(Menu subMenu1) {
            this.subMenu1 = subMenu1;
        }
        public Menu getSubMenu2() {
            return subMenu2;
        }
        public void setSubMenu2(Menu subMenu2) {
            this.subMenu2 = subMenu2;
        }
        public InputFile getInputFile() {
            return inputFile;
        }
        public void setInputFile(InputFile inputFile) {
            this.inputFile = inputFile;
        }
        public OutputFile getOutputFile() {
            return outputFile;
        }
        public void setOutputFile(OutputFile outputFile) {
            this.outputFile = outputFile;
        }
}


