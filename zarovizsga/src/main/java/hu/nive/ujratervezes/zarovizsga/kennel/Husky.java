package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog {

    private static final int HAPPINESS_WHEN_FED = 4;
    private static final int HAPPINESS_WHEN_PLAYING = 3;

    public Husky(String name) {
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
