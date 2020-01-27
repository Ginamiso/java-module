package academy.everyonecodes.java.week2.set2.examples.example1;

public class DoorOpener {
    public void open(Door door, Key key){
        if (door.getKeyphrase().equals(key.getKeyphrase())) {
            System.out.println("I'm opening door "+door.getDooNumber()+" using "+ key.getName()+"'s key.");
        }else{
            System.out.println("This is the wrong key");
        }
    }
}
