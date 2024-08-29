package Factory.Client;

import Factory.components.IosComponetsFactory;
import Factory.components.UIComponentsFactory;

public class Ios extends Platform{
    @Override
    public UIComponentsFactory createUICoponentFactory() {
        return new IosComponetsFactory();
    }
}
