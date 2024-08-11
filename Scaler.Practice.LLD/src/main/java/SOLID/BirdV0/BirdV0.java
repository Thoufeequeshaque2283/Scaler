package SOLID.BirdV0;

public class BirdV0 {
    String type;

    void fly(){
        if(type.equals("Sparrow")){
            System.out.println("Sparrow");
        }else if(type.equals("Pegion")){
            System.out.println("Pegion");
        }
    }
    void makeSound(){
        if(type.equals("Sparrow")){
            System.out.println("Sparrow");
        }else if(type.equals("Pegion")){
            System.out.println("Pegion");
        }
    }
}
