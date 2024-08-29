package Factory.Client;

import Factory.components.AndroidComponentsFactory;
import Factory.components.UIComponentsFactory;

public class Android extends Platform{

    @Override
    public UIComponentsFactory createUICoponentFactory() {
        return new AndroidComponentsFactory();
    }
}
