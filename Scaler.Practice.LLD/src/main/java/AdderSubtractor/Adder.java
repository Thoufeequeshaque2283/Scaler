package AdderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private int value;

    public Adder(Value v) {
        this.value = v.value;
    }
    @Override
    public Void call(){
        for(int i = 0; i <10000000; i++){
            value += i;
        }
        return null;
    }

}
