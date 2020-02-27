package academy.everyonecodes.java.evaluation2.handout.exercise3;

import java.util.List;

public class MysteryBoxes {

    private static List<MysteryBox> mysteryBoxes = List.of(new SparePartsBox(1), new SparePartsBox(2), new WeaponsUpgradeBox(1), new WeaponsUpgradeBox(2));

    public static List<MysteryBox> get(){
        return mysteryBoxes;
    }
}
