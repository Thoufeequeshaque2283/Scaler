package Decorator;

public class HouseBlend implements Bevarage{
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public void getDescription() {
       System.out.println("HouseBlend : "+getCost());
    }
}
