package Factory.components;

import Factory.components.Button.AndroidButton;
import Factory.components.Button.Button;
import Factory.components.DroupDown.AndroidDroupDown;
import Factory.components.DroupDown.DropDown;
import Factory.components.Menu.AndroidMenu;
import Factory.components.Menu.Menu;

public class AndroidComponentsFactory implements UIComponentsFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDroupDown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
