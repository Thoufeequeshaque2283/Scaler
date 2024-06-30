package ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
 public static void main(String[] args) {
     Store store = new Store(5);
     ExecutorService ex = Executors.newCachedThreadPool();
     for (int i = 0; i < 8; i++) {
         ex.execute(new Producer(store));
     }
     for (int i = 0; i < 20; i++) {
         ex.execute(new Consumer(store));
     }
     ex.shutdown();
 }

}
