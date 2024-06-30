package AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private int value;
    private Lock lock;

    public Subtractor(Value v, Lock lock) {
        this.value = v.value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        lock.lock(); // its will not allow to access any other .
        for(int i = 0; i < 100; i++){
//            lock.lock(); // its will not allow to access any other .
            System.out.println(i+" lock subtractor");
            value -= i; // critical section
//            System.out.println("unlock subtractor");
//            lock.unlock();
        }
        lock.unlock();
        return null;
    }
}
