package AdderSubtractorDeadLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private int value;
    private Lock lock;
    private Lock lock2;

    public Adder(Value v, Lock lock, Lock lock2) {
        this.value = v.value;
        this.lock = lock;
        this.lock2 = lock2;
    }
    @Override
    public Void call(){

        for(int i = 0; i <100; i++){
            lock2.lock();
            lock.lock();
            System.out.println(i+" Lock Adder");
            value += i;
//            System.out.println("Un lock Adder");
            lock2.unlock();
            lock.unlock();
        }

        return null;
    }

}
