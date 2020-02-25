package academy.everyonecodes.java.week8.extraExercises.exercise2;

import academy.everyonecodes.java.gitIgnore.week5.set2.exercise5.GotDataReader;

public class DeadManAndWomenPercentCalculator {
    private GotDataReader reader = new GotDataReader();
    DeathCounter counter = new DeathCounter();
    public String calculate(){
        long totalDeaths = counter.count();
        long deadMen = reader.read().stream()
                .filter(character -> character.getBookOfDeath().isPresent() && character.getGender().equals("1"))
                .count();
        long deadWomen = totalDeaths - deadMen;
        long deadMenPercentage = deadMen*100/totalDeaths;
        long deadWomenPercentage = deadWomen*100/totalDeaths;
        return "Dead men: "+deadMenPercentage+"%"+" Dead Women: "+deadWomenPercentage+"%";
    }
}
