package Menus.MenuModel;

public abstract  class MenuOption {
    private String option;
    private String menuLine;

    public MenuOption(String option, String menuLine) {
        this.option = option;
        this.menuLine = menuLine;
    }
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

    public abstract void doAction();
}
