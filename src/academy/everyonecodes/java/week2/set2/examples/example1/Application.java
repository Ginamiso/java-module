package academy.everyonecodes.java.week2.set2.examples.example1;

public class Application {
    public static void main(String[] args) {
        Door door = new Door(5,"Abracadabra");
        Key ke1 = new Key("David", "Abracadabra");
        Key key2 = new Key("Sercan", "lalala");
        DoorOpener opener = new DoorOpener();
        opener.open(door, ke1);
        opener.open(door, key2);
    }
}
