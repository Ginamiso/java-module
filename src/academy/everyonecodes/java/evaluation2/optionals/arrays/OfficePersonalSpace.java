package academy.everyonecodes.java.evaluation2.optionals.arrays;

public class OfficePersonalSpace {
    private String[] space;

    public OfficePersonalSpace() {
        this.space = new String[20];
    }
    public void add(int spaceNumber, String stuff){
        space[spaceNumber]= "water "+stuff;
    }
    public void empty(int spaceNumber){
        space[spaceNumber] = "Empty";
    }
    public String get(int spaceNumber){
        return space[spaceNumber];
    }
}
