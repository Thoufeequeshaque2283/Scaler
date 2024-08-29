package Decorator;

public class DarkRoast implements Bevarage{
    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public void getDescription() {
      System.out.println("Dark Roast : "+ getCost());
    }
}
