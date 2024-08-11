package IterableAndIterator;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for (int i : list) {
//            System.out.println(i);
        }
        Numbers numbers = new Numbers(list);
        for(int j : numbers.list){
            System.out.println(j);
        }
    }
}
