package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog {

    private static final int HAPPINESS_WHEN_FED = 2;
    private static final int HAPPINESS_WHEN_PLAYING = 2;

    public Beagle(String name) {
        super(name);
    }

    @Override
    void feed() {
        incrementHappiness(HAPPINESS_WHEN_FED);
    }

    @Override
    void play(int hours) {
        incrementHappiness(HAPPINESS_WHEN_PLAYING * hours);
    }
}
