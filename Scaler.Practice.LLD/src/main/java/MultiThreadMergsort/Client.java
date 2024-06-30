package MultiThreadMergsort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(7, 4, 3, 2, 5, 8, 1, 6, 10, 9);
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Sorter sorter = new Sorter(list,ex);

        Future<List<Integer>> listFuter = ex.submit(sorter);
        List<Integer> ls = listFuter.get();

        System.out.println("Sorted List: " + ls);
        ex.shutdown();
    }
}
