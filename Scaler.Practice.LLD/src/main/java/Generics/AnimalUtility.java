package Generics;
import java.util.List;
public class AnimalUtility {
    //    java: incompatible types: java.util.List<Generics.Dog> cannot be converted to java.util.List<Generics.Animal>
    //    public static void printAnimalNames(List<Animal> animals){
    //        for(Animal animal : animals){
    //            System.out.println(animal.name);
    //        }
    //    }

        // if we give <T Extends Anmal> its syntax . now we can use Anaml list any other below of anmal list
    //    genericmethod with uperBound on Animals
    public static <T extends Animal> List<T> printAnimalNames(List<T> animals){
//        animals.add(new Animal("Tomy"));
        animals.remove(animals.size()-1);
        for(Animal animal : animals){
            System.out.println(animal.name);
        }
        return animals;
    }

//    above and below both are same instead of this <T extends Animal> we are using inside list 
    public static void printAnimalNames2(List<? extends Animal> animals){
//        animals.add(new Animal("Tomy"));
//        animals.remove(animals.size()-1);
        for(Animal animal : animals){
            System.out.println(animal.name);
        }
    }
}
