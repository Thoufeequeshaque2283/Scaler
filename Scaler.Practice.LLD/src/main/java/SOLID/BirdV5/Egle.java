package SOLID.BirdV5;

public class Egle extends BirdV4 implements Flyable {
    flyingBehavir fh;
    public Egle(flyingBehavir Other) {
        this.fh = Other;
    }

    @Override
    public void fly() {
       fh.fly();
    }

    @Override
    void makeSound() {

    }
}
