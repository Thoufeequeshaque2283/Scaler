package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
   private int maxSpace;
   private List<Object> ls;

   Store(int maxSpace) {
       this.maxSpace = maxSpace;
       this.ls = new ArrayList<>();
   }

    public int getMaxSpace() {
        return maxSpace;
    }
    public int getListSize() {
       return this.ls.size();
    }

    public void Produce(){
       ls.add(new Object());
    }

    public void Consume(){
       ls.remove(ls.size()-1);
    }
}
