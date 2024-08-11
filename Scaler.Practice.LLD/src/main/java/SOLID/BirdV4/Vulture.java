package SOLID.BirdV4;

public class Vulture extends BirdV4 implements Flyable{
    @Override
    void makeSound() {

    }
    FlyHigh fh = new FlyHigh();
    @Override
    public void fly() {
        fh.fly();
    }
}
