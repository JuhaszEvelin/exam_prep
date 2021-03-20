package oop;

public class Clownfish extends Fish {

        private String color2;
        private int reactionWhenFed = 1;

    public Clownfish(String name, String color, String color2, int weight) {
        super(name, color, weight, false);
        this.color2 = color2;
    }

    @Override
    public String status() {
        return getName()+", "+ "weight: "+getWeight()+", "
                +"color: "+getColor()+ "-"+color2+", "
                +"short-term memory loss: "+isHasMemoryLoss();
    }

    @Override
    public void feed() {
        setWeight(reactionWhenFed);
    }
}
