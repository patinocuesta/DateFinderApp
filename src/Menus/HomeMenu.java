package Menus;

import Data.FileSource;
import Data.FileToPrint;
import Functions.TextMatcherParser;
import Functions.TextReader;
import Menus.MenuModel.Menu;
import Menus.MenuModel.MenuOption;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeMenu {
Scanner scanner = new Scanner(System.in);
private Menu mainMenu= new Menu();
private Menu subMenu1= new Menu(1);
private Menu subMenu2= new Menu(2);
private FileSource fileSource = new FileSource("SampleTest","txt","C:\\Users\\"+ System.getProperty("user.name")+"\\Desktop\\");
private FileToPrint fileToPrint = new FileToPrint("Dates_found_in "+ fileSource.getSourceNameFile(),"txt","C:\\Users\\"+ System.getProperty("user.name")+"\\Desktop\\");

public HomeMenu() {}
     public void  homeMenuStart() {
         System.out.println("**************");
         System.out.println("* DateFinder *");
         System.out.println("**************\n");
         subMenu1.add(new MenuOption("1","Edit source file  name"+"\n\t\t Current file name: "+ fileSource.getSourceNameFile()){
             @Override
             public void doAction() {
                 scanner = new Scanner(System.in);
                 System.out.print("Enter file name : ");
                 String input = scanner.nextLine();
                 //tratamiento nombre
                 fileSource.setSourceNameFile(input);
                 System.out.println("File name : " + fileSource.getSourceNameFile()+"\n");
                 this.setMenuLine("Edit source file  name"+"\n\t\t Current file name: "+ fileSource.getSourceNameFile());
             }
         });
         subMenu1.add(new MenuOption("2","Edit source file extension (txt or pdf)"+"\n\t\t Current file extension: "+ fileSource.getSourceExtFile()){
             @Override
             public void doAction() {
                 scanner = new Scanner(System.in);
                 System.out.print("Enter file extension : ");
                 String input = scanner.nextLine();
                 if  (input!="txt"|| input !="pdf"){
                     System.out.print("Wrong format. Try again:");
                      input = scanner.nextLine();
                 }
                 fileSource.setSourceExtFile(input);
                 System.out.println("File extension : " + fileSource.getSourceExtFile() +"\n");
                 this.setMenuLine("Edit source file extension"+"\n\t\t Current file extension: "+ fileSource.getSourceExtFile());
             }
         });
         subMenu1.add(new MenuOption("3","Edit source file  path"+"\n\t\t Current file path: "+ fileSource.getSourcePathFile()){
            @Override
             public void doAction() {
                scanner = new Scanner(System.in);
                System.out.print("Enter file path : ");
                String input = scanner.nextLine();
                input = input.replace("\\","\\\\");
                fileSource.setSourcePathFile(input);
                System.out.println("File path : " + fileSource.getSourcePathFile()+"\n");
                this.setMenuLine("Edit source file  path"+"\n\t\t Current file path: "+ fileSource.getSourcePathFile());
            }
         });
         subMenu1.add(new MenuOption("4","Edit output file name"+"\n\t\t Current file name: "+ fileToPrint.getDestinationNameFile()){
             @Override
             public void doAction() {
                 scanner = new Scanner(System.in);
                 System.out.print("Enter file name : ");
                 String input = scanner.nextLine();
                 //tratamiento nombre
                 fileToPrint.setDestinationNameFile(input);
                 System.out.println("File name : " + fileToPrint.getDestinationNameFile()+"\n");
                 this.setMenuLine("Edit output file  name"+"\n\t\t Current file name: "+ fileToPrint.getDestinationNameFile());
             }
         });
         subMenu1.add(new MenuOption("5","Edit output file extension(pdf ou txt)"+"\n\t\t Current file extension: "+ fileToPrint.getDestinationExtFile()){
             @Override
             public void doAction() {
                 scanner = new Scanner(System.in);
                 System.out.print("Enter file name : ");
                 String input = scanner.nextLine();
                 if  (input!="txt"|| input !="pdf"){
                     System.out.print("Wrong format. Try again:");
                     input = scanner.nextLine();
                 }
                 fileToPrint.setDestinationExtFile(input);
                 System.out.println("File extension : " + fileToPrint.getDestinationExtFile()+"\n");
                 this.setMenuLine("Edit output file  extension"+"\n\t\t Current file extension: "+ fileToPrint.getDestinationExtFile());
             }
         });
         subMenu1.add(new MenuOption("6","Edit output file path"+"\n\t\t Current file path: "+ fileToPrint.getDestinationPathFile()){
             @Override
             public void doAction() {
                 scanner = new Scanner(System.in);
                 System.out.print("Enter file name : ");
                 String input = scanner.nextLine();
                 input = input.replace("\\","\\\\");
                 fileToPrint.setDestinationPathFile(input);
                 System.out.println("File path : " + fileToPrint.getDestinationPathFile()+"\n");
                 this.setMenuLine("Edit output file  path"+"\n\t\t Current file path: "+ fileToPrint.getDestinationPathFile());
             }
         });

         subMenu1.add(new MenuOption("+","Go and get it!") {
             @Override
             public void doAction() {
                  TextReader textReader =  new TextReader(fileSource.getSourcePathFile()
                         ,fileSource.getSourceNameFile()
                         ,fileSource.getSourceExtFile());
                 String text = textReader.fileReaderStr();
                 TextMatcherParser textMatcherParser = new TextMatcherParser();
                 try {
                     BufferedWriter writer = new BufferedWriter(new FileWriter(fileToPrint.getDestinationPathFile()
                                                                                       + fileToPrint.getDestinationNameFile()
                                                                                       +"."+fileToPrint.getDestinationExtFile()));
                     writer.write(textMatcherParser.stringTextToStringMultilevelList(text));
                     writer.close();
                 }catch (IOException e ) {
                     //e.printStackTrace();
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
                 }catch (NullPointerException  e ) {
                     //e.printStackTrace();
                 } catch(Exception e ) {
                     //System.out.println("Unexcepted Exception");
                    // e.printStackTrace();
                 }
                 finally{}
             }
         });



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
    public FileSource getFileSource() {
        return fileSource;
    }
    public void setFileSource(FileSource fileSource) {
        this.fileSource = fileSource;
    }
    public FileToPrint getFileToPrint() {
        return fileToPrint;
    }
    public void setFileToPrint(FileToPrint fileToPrint) {
        this.fileToPrint = fileToPrint;
    }
}


