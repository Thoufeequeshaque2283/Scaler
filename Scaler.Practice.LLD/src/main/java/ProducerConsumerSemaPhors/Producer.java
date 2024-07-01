package ProducerConsumerSemaPhors;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{
    private Store store;
    private Semaphore preducerSema;
    private Semaphore consumeSema;

    public Producer(Store store, Semaphore preducerSema, Semaphore consumeSema) {
        this.store = store;
        this.preducerSema = preducerSema;
        this.consumeSema = consumeSema;
    }

    @Override
    public void run() {
        while (true){
            try {
                preducerSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(store.getLsSize() < store.getMaxSize()){
                System.out.println("Producer " + store.getLsSize());
                store.Produce();
            }
            consumeSema.release();

        }
    }
}
