package AdderSubtractorSyncronization;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;

    public Subtractor(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {

        for(int i = 0; i < 100; i++){
            synchronized (v) {
                System.out.println(i+" subtractor");
                this.v.value -= i; // critical section
            }
        }
        return null;
    }
}
