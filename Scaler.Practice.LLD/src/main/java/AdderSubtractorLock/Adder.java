package AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private int value;
    private Lock lock;

    public Adder(Value v, Lock lock) {
        this.value = v.value;
        this.lock = lock;
    }
    @Override
    public Void call(){
        lock.lock();
        for(int i = 0; i <100; i++){
//            lock.lock();
            System.out.println(i+" Lock Adder");
            value += i;
//            System.out.println("Un lock Adder");
//            lock.unlock();
        }
        lock.unlock();
        return null;
    }

}
