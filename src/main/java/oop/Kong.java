package oop;

public class Kong extends Fish{

    private int reactionWhenFed = 2;

    public Kong(String name, String color, int weight, boolean hasMemoryLoss) {
        super(name, color, weight, hasMemoryLoss);
    }

    @Override
    public void feed() {
        setWeight(reactionWhenFed);
    }
}
