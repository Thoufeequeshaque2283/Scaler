package ProducerConsumerSemaPhors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxSize;
    private ConcurrentLinkedQueue ls;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.ls = new ConcurrentLinkedQueue(); // this connot go wrong even if 5k threads continuesly
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getLsSize() {
        return ls.size();
    }

    public void Produce(){
        ls.add(new Object());
    }
    public void Consume(){
        ls.remove();// always delete last element
    }
}
