package LamdasAndStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client1 {
    public static void main(String[] args) {
        List<Integer> ls1 = List.of(5,10,2,1,16,3,8,1,2,2);

        Stream<Integer> ls2 = ls1.stream();
        List<Integer> l2 = ls1.stream().filter(elem-> elem%2==0).map(elem-> elem*elem).collect(Collectors.toList());
    }
}
