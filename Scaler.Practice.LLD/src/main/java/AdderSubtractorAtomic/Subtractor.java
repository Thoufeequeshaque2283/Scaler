package AdderSubtractorAtomic;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value v;

    public Subtractor(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 0; i < 10000000; i++){
            this.v.value.addAndGet(-i);
        }
        return null;
    }
}
