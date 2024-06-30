package AdderSubtractorSynchronizationMethod;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value v;

    public Adder(Value v) {
        this.v = v;
    }
    @Override
    public Void call(){
        for(int i = 0; i <100; i++){
                this.v.incrementBy(i);
            }
        return null;
    }

}
