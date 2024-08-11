package SOLID.BirdV4;

public class Pigeon extends BirdV4 implements Flyable {
    FlyLow FL = new FlyLow();
    @Override
    public void fly() {
       FL.fly();
    }

    @Override
    void makeSound() {

    }
}
