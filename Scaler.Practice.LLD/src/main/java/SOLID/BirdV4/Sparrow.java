package SOLID.BirdV4;

public class Sparrow extends BirdV4 implements Flyable {

    @Override
    void makeSound() {

    }
    FlyLow FlyLow = new FlyLow();

    @Override
    public void fly() {
    FlyLow.fly();
    }
}
