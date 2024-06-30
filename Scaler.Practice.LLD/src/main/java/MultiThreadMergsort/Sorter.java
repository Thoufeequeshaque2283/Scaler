package MultiThreadMergsort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arraToSort;
    private ExecutorService ex;
    Sorter(List<Integer> arraToSort,ExecutorService ex){
      this.arraToSort = arraToSort;
      this.ex = ex;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arraToSort.size() == 1){
            return arraToSort;
        }
        int mid = arraToSort.size() / 2;

        //split the array
        List<Integer> leftArray = new ArrayList<>(arraToSort.subList(0, mid));
        List<Integer> rightArray = new ArrayList<>(arraToSort.subList(mid, arraToSort.size()));

        //split more
        Sorter leftArraySorter = new Sorter(leftArray,ex);
        Sorter rightArraySorter = new Sorter(rightArray,ex);

        //submit is like run method, starting the thread
        Future<List<Integer>> leftFuter = ex.submit(leftArraySorter);
        Future<List<Integer>> rightFuter = ex.submit(rightArraySorter);

        // this will return sorted array. it will wait untill threads get completed
        List<Integer> sortedLeftArray = leftFuter.get();
        List<Integer> sortedRightArray = rightFuter.get();

        return mergeSort(sortedLeftArray,sortedRightArray);
    }
    public List<Integer> mergeSort(List<Integer> leftArray, List<Integer> rightArray){
        List<Integer> sortedArray = new ArrayList<>();
        int i = 0, j = 0;

        while (i < leftArray.size() && j < rightArray.size()) {
            if (leftArray.get(i) <= rightArray.get(j)) {
                sortedArray.add(leftArray.get(i));
                i++;
            } else {
                sortedArray.add(rightArray.get(j));
                j++;
            }
        }

        while (i < leftArray.size()) {
            sortedArray.add(leftArray.get(i));
            i++;
        }

        while (j < rightArray.size()) {
            sortedArray.add(rightArray.get(j));
            j++;
        }

        return sortedArray;

    }
}
