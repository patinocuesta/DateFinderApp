package Menus;

import Data.Files.InputFile;
import Data.Files.OutputFile;
import Services.RegexMatchers.FileMatcher;
import Services.RegexMatchers.ExtMatcher;
import Services.RegexMatchers.PathMatcher;
import Services.ReportingServices.ExportReportPdf;
import Services.ReportingServices.ExportReportTxt;
import Services.ParserServices.TextMatcherParser;
import Services.ImportServices.ImportFile;
import Menus.MenuModel.Menu;
import Menus.MenuModel.MenuOption;

import java.io.*;
import java.util.Scanner;

public class HomeMenu {
    Scanner scanner = new Scanner(System.in);
    private Menu mainMenu= new Menu();
    private Menu subMenu1= new Menu(1);
    private Menu subMenu2= new Menu(2);
    private InputFile inputFile = new InputFile("PresidentsList","pdf","C:\\Users\\"+ System.getProperty("user.name")+"\\Desktop\\");
    private OutputFile outputFile = new OutputFile("Presidents","txt","C:\\Users\\"+ System.getProperty("user.name")+"\\Desktop\\");

    public HomeMenu() {}
         public void  homeMenuStart() {

             System.out.println("**************");
             System.out.println("* DateFinder *");
             System.out.println("**************\n");
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
             subMenu1.add(new MenuOption("5","Edit output file extension(pdf ou txt)"+"\n\t\t Current file extension: "+ outputFile.getDestinationExtFile()){
                 @Override
                 public void doAction() {
                     ExtMatcher extMatcherOutput = new ExtMatcher();
                     extMatcherOutput.outputFileExtValidator(outputFile);
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
             subMenu1.add(new MenuOption("+","Go and get it!") {
                 @Override
                 public void doAction() {
                     try {
                         ImportFile importFile = new ImportFile();
                         File file = new File(inputFile.getSourcePathFile() + inputFile.getSourceNameFile() + "." + inputFile.getSourceExtFile());
                         String text = importFile.fileReaderStr(file, inputFile.getSourceExtFile());
                         //System.out.print(text);
                         if (outputFile.getDestinationExtFile().equals("txt")) {
                             ExportReportTxt exportReportTxt = new ExportReportTxt();
                             exportReportTxt.generateReportTxt(text);
                         } else if (outputFile.getDestinationExtFile().equals("pdf")) {
                             File output = new File(outputFile.getDestinationPathFile() + outputFile.getDestinationNameFile() + "." + outputFile.getDestinationExtFile());
                             ExportReportPdf exportReportPdf = new ExportReportPdf();
                             exportReportPdf.createPdf();
                             exportReportPdf.writePdf(output, text);
                         } else {
                            // System.out.print(text);
                             System.out.print("\nError generating this rapport.\nContact le scervice support\nClosing\n");
                             System.exit(0);
                         }

                         System.out.print("Have a nice day!");
                         System.exit(0);
                     } catch (IOException e) {
                     }
                 }
             });







             subMenu2.add(new MenuOption("1","Enter your text") {
                 @Override
                 public void doAction() {
                     try {
                         String text = "";
                         Scanner sc = new Scanner(System.in);
                         while (sc.hasNextLine()) {
                             String textLine = sc.nextLine();
                             if (textLine.contains("$$$")) break;
                             text = text + "\n" + textLine;
                         }
                         System.out.println("\n************************************************************");
                         TextMatcherParser textMatcherParser = new TextMatcherParser();
                         System.out.println("************************************************************\n");
                         System.out.println(textMatcherParser.stringTextToStringMultilevelList(text));
                         System.out.println("----------------------------------------------");
                         System.out.print("Export report (Y/N):");
                         String input="";
                         input = sc.nextLine().toUpperCase();
                         if  (input=="Y"){
                             textMatcherParser = new TextMatcherParser();
                             try {
                                 BufferedWriter writer = new BufferedWriter(new FileWriter(
                                         "\\C:\\Users\\"+ System.getProperty("user.name")+ "\\Desktop\\"
                                                 + "reportDates"
                                                 + "." + "txt"));
                                 writer.write(textMatcherParser.stringTextToStringMultilevelList(text));
                                 writer.close();
                                 System.out.print("Have a nice day!");
                                 System.exit(0);
                             } catch (IOException e) {}
                         } else if (input=="N") {
                             System.out.print("Have a nice day!");
                             System.exit(0);
                         }
                         else {
                             System.out.print("Fill with Y/N. Try again:");
                             input = scanner.nextLine();
                         }
                     }catch (Exception e) {}
                 }
             }
                 );
             mainMenu.add(new MenuOption("1","Parse a document stored in your computer") {
                 @Override
                 public void doAction() {
                     subMenu1.loopUntilExit();
                 }
             }
             );
             mainMenu.add(new MenuOption("2","Parse an input text") {
                 @Override
                 public void doAction() {
                      subMenu2.loopUntilExit();
                 }
             }
             );
             mainMenu.loopUntilExit();
         }

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
        /*
        public ExtMatcher getExtMatcher() {
            return extMatcher;
        }
        public void setExtMatcher(ExtMatcher extMatcher) {
            this.extMatcher = extMatcher;
        }

    public FileMatcher getFileMatcher() {
        return fileMatcher;
    }

    public void setFileMatcher(FileMatcher fileMatcher) {
        this.fileMatcher = fileMatcher;
    }

    public PathMatcher getPathMatcher() {
        return pathMatcher;
    }

    public void setPathMatcher(PathMatcher pathMatcher) {
        this.pathMatcher = pathMatcher;
    }
    */
}


