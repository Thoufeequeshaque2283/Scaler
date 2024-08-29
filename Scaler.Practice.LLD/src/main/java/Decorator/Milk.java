package Decorator;

public class Milk extends AddOne{
    public Milk(Bevarage b){
        super(b);
    }
    @Override
    public int getCost() {
        return this.bevarage.getCost()+2;
    }

    @Override
    public void getDescription() {
       this.bevarage.getDescription();
       System.out.println("Milk");
    }
}
