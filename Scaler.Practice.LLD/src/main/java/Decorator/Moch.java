package Decorator;

public class Moch extends AddOne{
    public Moch(Bevarage b) {
        super(b);
    }
    @Override
    public int getCost() {
        return this.bevarage.getCost() + 20;
    }

    @Override
    public void getDescription() {
        this.bevarage.getDescription();
        System.out.println("Moch cost: ");
    }
}
