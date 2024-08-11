package SOLID.BirdV4;

public class Egle extends BirdV4 implements Flyable {
    FlyHigh fh = new FlyHigh();
    @Override
    public void fly() {
       fh.fly();
    }

    @Override
    void makeSound() {

    }
}
