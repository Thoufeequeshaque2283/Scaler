package Factory.Client;

import Factory.components.Button.Button;
import Factory.components.DroupDown.DropDown;
import Factory.components.Menu.Menu;
import Factory.components.UIComponentsFactory;

public class Client {
    public static void main(String[] args) {
        Platform p = new Android();
        UIComponentsFactory ui = p.createUICoponentFactory();
        DropDown drop  = ui.createDropDown();
        Button bot = ui.createButton();
        Menu men = ui.createMenu();

    }
}
