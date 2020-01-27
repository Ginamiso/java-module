package academy.everyonecodes.java.week4.reflection;

public class FromZeroRounder {
    public double round(double number){
        if(number < 0){
            return Math.floor(number);
        }else{
            return Math.ceil(number);
        }
    }

}
