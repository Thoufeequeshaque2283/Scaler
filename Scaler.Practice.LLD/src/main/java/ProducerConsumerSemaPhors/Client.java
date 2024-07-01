package ProducerConsumerSemaPhors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        ExecutorService ex = Executors.newCachedThreadPool();
        Semaphore preducerSema = new Semaphore(5);
        Semaphore consumeSema = new Semaphore(0);

        for (int i = 0; i < 8; i++) {
            ex.execute(new Producer(store,preducerSema,consumeSema));
        }
        for (int i = 0; i < 20; i++) {
            ex.execute(new Consumer(store,preducerSema,consumeSema));
        }
        ex.shutdown();

    }
}
