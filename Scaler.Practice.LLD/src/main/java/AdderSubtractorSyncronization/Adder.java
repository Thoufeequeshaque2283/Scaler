package AdderSubtractorSyncronization;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;

    public Adder(Value v) {
        this.v = v;
    }
    @Override
    public Void call(){
        for(int i = 0; i <100; i++){
            synchronized (v) {
                System.out.println(i + "  Adder");
                this.v.value += i;
            }
        }
        return null;
    }

}
