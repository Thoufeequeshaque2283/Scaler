package LamdasAndStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    @FunctionalInterface
    interface Thoufeeque {
        void thoufee();
    }

    public static void main(String[] args) {
//        Annonymous class
        Runnable r = new Runnable(){
            public void run() {
                System.out.println("Hello World");
            }
        };
        Thread thread = new Thread(r);
        thread.run();

//        Client c = new Client();
//        Thoufeeque t = c.new Thoufeeque() {
//            void thoufee() {
//                System.out.println("Thoufee");
//            }
//        };
//        t.thoufee();

//        Lamda Expresstion
        Thread t2 = new Thread(()-> System.out.println("lamda"));
        t2.run();

        Thoufeeque t3 = ()-> System.out.println("lamda Thofee");
        t3.thoufee();
        List<Integer> ls = new ArrayList<>();
                ls.add(4);
                ls.add(1);
                ls.add(5);
                ls.add(2);
                ls.add(3);
//Comparator with lamda
        Collections.sort(ls,(a,b)->a-b);
//  Comparable
//        Collections.sort(ls,Comparator.reverseOrder());
        System.out.println();


//        Streams
        List<Integer> ls1 = List.of(5,10,2,1,16,3,8,1,2,2);
        Stream<Integer> s1 = ls1.stream();

//        foreach is terminal operation
        s1.forEach((elem)->System.out.print(elem+","));

//        no changes in original collection via stream. if we explicitly change like ls1.add() this will happen
        System.out.println();
        ls1.stream()
                .limit(4).
                forEach(elem -> System.out.print(elem+" "));
        System.out.println();
        System.out.println();

        Stream<Integer> s2 = ls1.stream()
                .limit(4);
        s2.forEach(elem -> System.out.print(elem+" "));

        Stream<Integer> s3 = ls1.stream();
        s3.limit(4).forEach(elem-> System.out.print(elem+""));

        System.out.println();System.out.println();System.out.println();


        List<Student> list1 = new ArrayList<>();
        Student st1 = new Student(25,65.0,"Mohit",10.0);
        Student st2 = new Student(21,78.0,"nishanth",100.0);

        list1.add(new Student(25,65.0,"Mohit",10.0));
        list1.add(new Student(21,78.0,"nishanth",100.0));
        list1.add(new Student(28,20.0,"nishanth",90.0));
// filter : intermediet
        list1.stream().filter(elem-> {
            return elem.psp < 50;
        }).forEach(elem ->{
//            System.out.println(elem.name+" "+elem.psp);
        });

        // Collect terminal
        List<Student> c = list1.stream().filter(elem -> elem.psp > 50).collect(Collectors.toList());
//        System.out.println(c);

        //    Map : intermediet
        List<Integer> l2 = ls1.stream().filter(elem-> elem%2==0).map(elem-> elem*elem).collect(Collectors.toList());
//        System.out.println(l2);

        List<Integer> l3 = ls1.stream()
                .distinct()
                .filter(elem-> elem%2==0)
                .map(elem-> elem*elem)
                .sorted((a,b)->b-a)
                .collect(Collectors.toList());
//        System.out.println("l2"+ls1);
//        System.out.println("l3"+l3);

        System.out.println();
        Optional<Integer> n = ls1.stream()
                .distinct()
                .filter(elem-> elem%2==0)
                .map(elem-> elem*elem)
                .sorted((a,b)->b-a)
                .findFirst();
        if(n.isPresent()) {
//            System.out.println(n);
        }
        System.out.println();
        System.out.println();

        long v = ls1.stream().distinct().map(e->{
            System.out.println("Counting "+e);
            return e*e;
        }).count();
          System.out.println(v);

          List<Integer> l5 = List.of(4,7,8,6);
//          find sum
        int sum = 0;
        for(Integer elem : l5){
            sum +=elem;
        }
        System.out.println(sum+" ");
// reduce is a terminal function
// it tries to coverage your whole stream into a single element based on some logic
        long k = ls.stream().reduce(0,(curr,elem)->{
            return curr + elem;
        });
        System.out.println(k+" ");

        long m = l5.stream().reduce(0,(max, elem)->{
            return Math.max(max,elem);
        });
        System.out.println("max "+m);

        List<List<Integer>> lsofls = Arrays.asList(
            Arrays.asList(1,2,3),
            Arrays.asList(4,5),
            Arrays.asList(6,7)
        );
        List<Integer> ans = lsofls.stream().flatMap(elem->{
            return elem.stream().map(elem1-> elem1 * elem1);
        }).collect(Collectors.toList());
        System.out.print(ans);

    }




}
