package MultiThredding;

public class NumberPrint implements Runnable{
    int num;
    public NumberPrint(int num){
        this.num = num;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(20000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

      System.out.println(num+" "+Thread.currentThread().getName()+" Hello");
    }
}
