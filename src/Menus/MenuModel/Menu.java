package Menus.MenuModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final String OPTION_EXIT="0";
    private static final String LEVEL_INDENTATION ="    ";
    private List<MenuOption> menuOptions=new ArrayList<>();
    private int level=0;

    public Menu(){}

    public Menu(int level){
        this.level=level;
    }

    public void add(MenuOption m){
        this.menuOptions.add(m);
    }
    public void loopUntilExit(){

        String input;

        try(Scanner sc=new Scanner(System.in)) {

            while (true) {

                System.out.print(this);
                System.out.println("----------------------------------------------");
                System.out.print("Enter your option:");
                input = sc.nextLine();

                if (input.equals(OPTION_EXIT)) {
                    return;
                }
                boolean foundOption = false;
                for (MenuOption m : menuOptions) {
                    if (m.getOption().equalsIgnoreCase(input)) {

                        m.doAction();
                        foundOption = true;
                    }
                }
                if (!foundOption) {
                    System.out.println("Sorry, unrecognized option");
                }
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Choose an option, "+OPTION_EXIT+" to exit.\n");
        for(MenuOption m:menuOptions){
            for(int i=0;i<level;i++){
                sb.append(LEVEL_INDENTATION);
            }
            sb.append(m).append("\n");
        }
        return sb.toString();
    }
}
