package AdderSubtractorSynchronizationMethod;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value v;

    public Subtractor(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {

        for(int i = 0; i < 100; i++){
            this.v.decrementBy(i);
        }
        return null;
    }
}
