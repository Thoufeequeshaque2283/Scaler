package Factory.Client;

public class PlatformFactory {
    public static Platform getPlatform(){
        if(getPlatform().equals("Android")){
            return new Android();
        }else if(getPlatform().equals("iOS")){
            return new Ios();
        }
        return null;
    }
}
