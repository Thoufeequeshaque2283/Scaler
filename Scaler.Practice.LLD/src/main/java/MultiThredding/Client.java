package MultiThredding;

public class Client {
    public static void main(String[] args) {
//        HelloWorldPrinter h = new HelloWorldPrinter();
//        h.run();
//        for(int i = 0; i< 100; i++){
//            Thread t = new Thread(h);
//            if(i == 10){
//                t.interrupt();
//            }
//            t.start();
//        }
    for(int i = 0; i < 1000; i++){
        NumberPrint n = new NumberPrint(i);
        Thread t = new Thread(n);
        t.start();
    }

    }
}
