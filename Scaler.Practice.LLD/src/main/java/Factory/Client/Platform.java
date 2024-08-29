package Factory.Client;

import Factory.components.UIComponentsFactory;

abstract public class Platform {
    public void setRefreshRate(){

    }
    public void setTheme(){

    }
    public static Platform createPlatform(String platformNames){
        return PlatformFactory.getPlatform();
    }
    abstract public UIComponentsFactory createUICoponentFactory();
}
