package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        Pair<Integer,Integer> p1 = new Pair<>();
        p1.setFirst(5);
        System.out.println(p1.getFirst());

        Pair<String,Integer> p2 = new Pair<>();
        p2.setFirst("hello");
        System.out.println(p2.getFirst());

//        Raw types
//        this is allowed for backword compatibility
        Pair p3 = new Pair();
        p3.first = 123;
        p3.second = "kabeer";
        HashMap map = new HashMap();
        map.put("kabeer", 123);
        System.out.println(map);

        // here we can use any data type
        p1.doSomething("ABC");
        System.out.println("------------------");

        List<Dog> dogs = new ArrayList();
        dogs.add(new Dog("Tobby"));
        dogs.add(new Dog("Tommy"));

        List<Animal> animals = new ArrayList();
        animals.add(new Dog("Tom"));
        animals.add(new Dog("Tom1"));

        //dogs inherits Animal but List of Animals inherits List
//        AnimalUtility.printAnimalNames(dogs);
        AnimalUtility.printAnimalNames(animals);

    }
}
