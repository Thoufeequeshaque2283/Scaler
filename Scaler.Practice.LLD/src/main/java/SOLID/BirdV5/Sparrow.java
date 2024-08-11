package SOLID.BirdV5;

public class Sparrow extends BirdV4 implements Flyable {
    flyingBehavir fl;
    public Sparrow(flyingBehavir Other) {
        this.fl = Other;
    }

    @Override
    void makeSound() {

    }


    @Override
    public void fly() {
    fl.fly();
    }
}
