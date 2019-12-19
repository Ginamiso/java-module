package academy.everyonecodes.java.week2.set2.exercise3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HikerGatherer {
    public List<Hiker> gather(){
        List<Hiker> hikers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        while(!name.equals("")){
            System.out.println("what is your number?");
            int telephoneNumber = scanner.nextInt();
            scanner.nextLine();

            Hiker hiker = new Hiker(name, telephoneNumber);
            hikers.add(hiker);

            System.out.println("What is your name?");
            name = scanner.nextLine();


            }
        return hikers;
    }

        }
