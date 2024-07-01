package AdderSubtractorDeadLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private int value;
    private Lock lock;
    private Lock lock2;

    public Subtractor(Value v, Lock lock, Lock lock2) {
        this.value = v.value;
        this.lock = lock;
        this.lock2 = lock2;
    }

    @Override
    public Void call() throws Exception {

        for(int i = 0; i < 100; i++){
            lock.lock();
            lock2.lock();
            System.out.println(i+" lock subtractor");
            value -= i;
//            System.out.println("unlock subtractor");
            lock2.unlock();
            lock.unlock();
        }
        return null;
    }
}
