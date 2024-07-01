package ProducerConsumerSemaPhors;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer implements Runnable {
    private Store store;
    private Semaphore preducerSema;
    private Semaphore consumeSema;
    public Consumer(Store store,Semaphore preducerSema,Semaphore consumeSema) {
        this.store = store;
        this.preducerSema = preducerSema;
        this.consumeSema = consumeSema;
    }

    public void run() {
        while (true) {
            try {
                consumeSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(store.getLsSize() > 0){
                    System.out.println("Consumer " + store.getLsSize());
                    store.Consume();
               }
            preducerSema.release();

        }
    }
}
