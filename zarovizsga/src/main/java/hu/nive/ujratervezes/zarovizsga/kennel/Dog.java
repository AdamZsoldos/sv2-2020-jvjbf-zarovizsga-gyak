package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {

    private final String name;
    private int happiness = 0;

    protected Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    protected void incrementHappiness(int amount) {
        happiness += amount;
    }

    void feed() {
    }

    void play(int hours) {
    }
}
