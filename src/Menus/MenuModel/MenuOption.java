package Menus.MenuModel;
/**
 * Class abstract providing the frame for un action to be done in every menu option
 */
public abstract  class MenuOption {
    private String option;
    private String menuLine;
/**
 * Constructor
 * @param option
 * @param menuLine
 */
    public MenuOption(String option, String menuLine) {
        this.option = option;
        this.menuLine = menuLine;
    }
/**
 * Action to be implemented in every menu option
 */
    public abstract void doAction();
/**
 * Getters and setters.
 * @return
 */
    @Override
    public String toString() {
        return  option + "-" + menuLine ;
    }
    public String getOption() {
        return option;
    }
    public void setOption(String option) {
        this.option = option;
    }
    public String getMenuLine() {
        return menuLine;
    }
    public void setMenuLine(String menuLine) {
        this.menuLine = menuLine;
    }
}
