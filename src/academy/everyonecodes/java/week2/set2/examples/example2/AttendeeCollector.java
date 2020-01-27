package academy.everyonecodes.java.week2.set2.examples.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendeeCollector {
    public List<Attendee> collect(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        List<Attendee> attendees = new ArrayList<>();
        while(!name.equals("")){
            System.out.println("How old are you?");
            int age = scanner.nextInt();
            scanner.nextLine();
            Attendee attendee = new Attendee(name, age);
            attendees.add(attendee);
            System.out.println("what is your name?");
            name = scanner.nextLine();

        }
        return attendees;
    }
}
