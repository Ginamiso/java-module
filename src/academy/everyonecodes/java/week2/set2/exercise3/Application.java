package academy.everyonecodes.java.week2.set2.exercise3;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        HikerGatherer hikerGatherer = new HikerGatherer();
        List<Hiker> hikers = hikerGatherer.gather();
        Hike hike = new Hike("20/12/2020", hikers);
        HikeDisplayer hikeDisplayer = new HikeDisplayer();
        hikeDisplayer.display(hike);

    }


    }

