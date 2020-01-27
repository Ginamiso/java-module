package academy.everyonecodes.java.week3.set1.exercise1;

import academy.everyonecodes.java.christmas.exercise2.TramTimeCalculator;
import academy.everyonecodes.java.christmas.exercise2.WalkingTimeCalculator;

public class CommuteTimeCalculator {

    double calculateWalkingTime(double kilometers) {

        return kilometers * 15;
    }

    double calculateTramTime(double stations) {

        return stations * 4;
    }

    public double calculateTotalTime(double stations, double walkingToTram, double walkingToHouse) {
        double walkingTramTime = calculateWalkingTime(walkingToTram);
        double walkingHouseTime = calculateWalkingTime(walkingToHouse);
        double tram = calculateTramTime(stations);
        return walkingTramTime + walkingHouseTime + tram;
    }
}
