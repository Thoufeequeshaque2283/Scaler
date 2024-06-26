package ThreadPool;

public class NumberPrint implements Runnable{
    int num;
    public NumberPrint(int num){
        this.num = num;
    }

    @Override
    public void run() {


      System.out.println(num+" "+Thread.currentThread().getName()+" Hello");
    }
}
