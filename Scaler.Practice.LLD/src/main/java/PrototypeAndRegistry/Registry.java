package PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Registry {
    public Registry() {

    }
    private static Registry reg = null;

    public static Registry getRegitryObject(){
        Lock l = new ReentrantLock();
        if(reg == null){
            l.lock();
            if(reg == null){
                reg = new Registry();
            }
            l.unlock();
        }
        return reg;
    }
    private HashMap<String,Student> registry = new HashMap<>();

    public void setRegistry(String key,Student student) {
        registry.put(key,student);
    }
    public Student getRegistry(String key) {
        return registry.get(key).copy();
    }

}
