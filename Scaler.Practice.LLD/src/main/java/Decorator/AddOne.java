package Decorator;

import Practice.Adder;

public abstract class AddOne implements Bevarage{
    Bevarage bevarage;
    public AddOne(Bevarage b){
        this.bevarage = b;
    }
}
