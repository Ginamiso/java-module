package academy.everyonecodes.java.christmas.exercise2;

public class TotalTimeCalculator {
    public double calculateTotalTime(int stations, double walkingToTram, double walkingToHouse){
        WalkingTimeCalculator walkingTime = new WalkingTimeCalculator();
        double walkingTramTime = walkingTime.calculateWalkingTime(walkingToTram);
        double walkingHouseTime = walkingTime.calculateWalkingTime(walkingToHouse);
        TramTimeCalculator tramTime = new TramTimeCalculator();
        int tram = tramTime.calculateTramTime(stations);
        return walkingTramTime + walkingHouseTime + tram;

    }
}
