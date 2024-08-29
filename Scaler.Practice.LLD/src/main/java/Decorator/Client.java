package Decorator;

public class Client {
    public static void main(String[] args) {
        Bevarage DarkRoast = new DarkRoast();
        System.out.println(DarkRoast.getCost());
        DarkRoast = new Milk(DarkRoast);
        System.out.println(DarkRoast.getCost());
        DarkRoast = new Moch(DarkRoast);
        System.out.println(DarkRoast.getCost());
//        System.out.println(DarkRoast.getCost());
    }
}
