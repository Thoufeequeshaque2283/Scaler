package ProducerConsumer;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
         while(true){
             synchronized (store) {
                 if (store.getListSize() < store.getMaxSpace()) {
                     System.out.println("producer producing " + store.getListSize());
                     store.Produce();
                 }
             }
         }
    }
}
