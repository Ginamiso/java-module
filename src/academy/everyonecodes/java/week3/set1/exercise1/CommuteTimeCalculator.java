package academy.everyonecodes.java.week3.set1.exercise1;

import academy.everyonecodes.java.christmas.exercise2.TramTimeCalculator;
import academy.everyonecodes.java.christmas.exercise2.WalkingTimeCalculator;

public class CommuteTimeCalculator {
    public double calculateWalkingTime(double kilometers) {
        int walkingSpeed = 15;
        return kilometers * walkingSpeed;
    }

    public int calculateTramTime(int stations) {
        int tramSpeed = 4;
        return stations * tramSpeed;
    }

    public double calculateTotalTime(int stations, double walkingToTram, double walkingToHouse) {
        WalkingTimeCalculator walkingTime = new WalkingTimeCalculator();
        double walkingTramTime = walkingTime.calculateWalkingTime(walkingToTram);
        double walkingHouseTime = walkingTime.calculateWalkingTime(walkingToHouse);
        TramTimeCalculator tramTime = new TramTimeCalculator();
        int tram = tramTime.calculateTramTime(stations);
        return walkingTramTime + walkingHouseTime + tram;
    }
}
