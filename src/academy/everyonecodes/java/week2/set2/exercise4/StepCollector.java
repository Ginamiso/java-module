package academy.everyonecodes.java.week2.set2.exercise4;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class StepCollector {
    public List<Integer> collect(){
        List<String> names = List.of("Matilda","Hansel","Derek");
        List<Integer> steps = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(String name : names){
            System.out.println(name + ", how many steps did u make?");
            int step = scanner.nextInt();
            steps.add(step);
        }
        return steps;
    }
}
