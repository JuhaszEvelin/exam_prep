package oop;

public abstract class Fish {

    private String name;
    private String color;
    private int weight;
    private boolean hasMemoryLoss;

    public void setWeight(int weight) {
        this.weight += weight;
    }

    public Fish(String name, String color, int weight, boolean hasMemoryLoss) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.hasMemoryLoss = hasMemoryLoss;
    }

    public String status(){
        return name+", "+ "weight: "+weight+", "
                +"color: "+color+ ", "
                +"short-term memory loss: "+hasMemoryLoss;
    }

    public abstract void feed();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isHasMemoryLoss() {
        return hasMemoryLoss;
    }
}
