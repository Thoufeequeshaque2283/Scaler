package Factory.components;

import Factory.components.Button.Button;
import Factory.components.Button.IOSButton;
import Factory.components.DroupDown.DropDown;
import Factory.components.DroupDown.IOSDropDown;
import Factory.components.Menu.IOSMenu;
import Factory.components.Menu.Menu;

public class IosComponetsFactory implements UIComponentsFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
