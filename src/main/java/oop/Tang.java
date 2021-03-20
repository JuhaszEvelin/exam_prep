package oop;

public class Tang extends Fish{

    private int reactionWhenFed = 1;

    public Tang(String name, String color, int weight) {
        super(name, color, weight, true);
    }

    @Override
    public void feed() {
        setWeight(reactionWhenFed);
    }
}
