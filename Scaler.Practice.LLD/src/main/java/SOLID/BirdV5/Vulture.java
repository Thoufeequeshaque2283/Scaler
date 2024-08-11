package SOLID.BirdV5;

public class Vulture extends BirdV4 implements Flyable {
    flyingBehavir fh;
    public Vulture(flyingBehavir Other) {
        this.fh = Other;
    }

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fh.fly();
    }
}
