package Factory.components;


import Factory.components.Button.Button;
import Factory.components.DroupDown.DropDown;
import Factory.components.Menu.Menu;

public interface UIComponentsFactory {
    Button createButton();
    DropDown createDropDown();
    Menu createMenu();
}
