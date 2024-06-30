package AdderSubtractor;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private int value;

    public Subtractor(Value v) {
        this.value = v.value;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 0; i < 10000000; i++){
            value -= i;
        }
        return null;
    }
}
