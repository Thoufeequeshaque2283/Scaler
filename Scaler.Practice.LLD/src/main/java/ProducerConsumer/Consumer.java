package ProducerConsumer;

public class Consumer implements Runnable {

    private Store store;
    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {

          while (true) {
              synchronized (store) {
                  if (store.getListSize() > 0) {
                      System.out.println("Consumer Consuming " + store.getListSize());
                      store.Consume();
                  }
              }
          }
    }
}

