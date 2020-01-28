package academy.everyonecodes.java.week6.set2.exercise3;

public class TemplateChooser {

    public String choose(String name) {
        if(name.contains("Hokopoko")) {
            return "privileged";
        }if(name.startsWith("Mrs.")|| name.startsWith("Ms.")){
            return "female";
        }if(name.startsWith("Mr.")){
            return "male";
        }
        return "default";
    }
}
