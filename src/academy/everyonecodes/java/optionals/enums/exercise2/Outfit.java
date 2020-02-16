package academy.everyonecodes.java.optionals.enums.exercise2;


public class Outfit {
    private Socks socks;
    private Headpiece headpiece;

    public Outfit(Socks socks, Headpiece headpiece){
        this.socks = socks;
        this.headpiece = headpiece;
    }
    public String getDescription(){
        String socksDescription = socks.getDescription();
        String headDescription = headpiece.getDescription();
        return  headDescription +" and "+ socksDescription;

    }

}
