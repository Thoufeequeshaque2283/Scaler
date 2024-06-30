package AdderSubtractorLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Lock lock = new ReentrantLock();
        Value v = new Value();
        ExecutorService ex = Executors.newCachedThreadPool();
        Adder add = new Adder(v,lock);
        Subtractor sub = new Subtractor(v,lock);
        Future<Void> future = ex.submit(add);
        Future<Void> future2 = ex.submit(sub);

        future.get();
        future2.get();
        ex.shutdown();
        System.out.print(v.value);
    }
}
