package academy.everyonecodes.java.week9.reflection;

public abstract class Car {
    private String brand;
    private String engineType;

    public Car(String brand, String engineType) {
        this.brand = brand;
        this.engineType = engineType;
    }
    public String describe(){
        return "I am a "+brand+" car!";
    }
    public abstract String refuel();
    }


