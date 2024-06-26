package MultiThredding;

public class Client {
    public static void main(String[] args) {

    for(int i = 0; i < 10000000; i++){
        NumberPrint n = new NumberPrint(i);
        Thread t = new Thread(n);
        t.start();
    }

    }
}
