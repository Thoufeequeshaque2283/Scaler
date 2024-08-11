package SOLID.BirdV5;

public class Pigeon extends BirdV4 implements Flyable {
    flyingBehavir fl;
    public Pigeon(flyingBehavir Other) {
        this.fl = Other;
    }
    @Override
    public void fly() {
       fl.fly();
    }

    @Override
    void makeSound() {

    }
}
