package academy.everyonecodes.java.week8.set2.exercise1;

public class AdvancedThief implements Thief {
    private final int SKILL_LEVEL = 2;

    @Override
    public void open(Safe safe) {
        safe.setDifficultyPoints(safe.getDifficultyPoints()-SKILL_LEVEL);

    }
}
