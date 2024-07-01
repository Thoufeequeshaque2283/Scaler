package AdderSubtractorAtomic;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        ExecutorService ex = Executors.newCachedThreadPool();
        Adder add = new Adder(v);
        Subtractor sub = new Subtractor(v);
        Future<Void> future = ex.submit(add);
        Future<Void> future2 = ex.submit(sub);

        future.get();
        future2.get();
        ex.shutdown();
        System.out.print(v.value);
    }
}
