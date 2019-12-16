package academy.everyonecodes.java.week2.set1.exercise1;

public class Student {
    private String name;
    private String pairProgrammer;

    public Student(String name, String pairProgrammer){
        this.name = name;
        this.pairProgrammer = pairProgrammer;
    }
    public String getName(){
        return name;
    }
    public String getPairProgrammer(){
        return pairProgrammer;
    }
    public void setPairProgrammer(String pairProgrammer){
        this.pairProgrammer = pairProgrammer;

    }

}
