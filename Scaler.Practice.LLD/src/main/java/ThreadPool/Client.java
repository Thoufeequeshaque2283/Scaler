package ThreadPool;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

    ExecutorService ex = Executors.newCachedThreadPool();
    for(int i = 0; i < 10000000; i++){
        NumberPrint n = new NumberPrint(i);
        ex.execute(n);
    }
        ex.shutdown();

    }
}
