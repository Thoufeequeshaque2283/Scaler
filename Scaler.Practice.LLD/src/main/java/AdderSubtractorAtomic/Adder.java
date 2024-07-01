package AdderSubtractorAtomic;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value v;

    public Adder(Value v) {
        this.v = v;
    }
    @Override
    public Void call(){
        for(int i = 0; i <10000000; i++){
            this.v.value.addAndGet(i);
        }
        return null;
    }

}
