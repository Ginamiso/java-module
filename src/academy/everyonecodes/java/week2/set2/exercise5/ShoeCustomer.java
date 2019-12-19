package academy.everyonecodes.java.week2.set2.exercise5;

public class ShoeCustomer {
    private double size;

    public ShoeCustomer(double size){
        this.size = size;
    }

    public boolean tryShoe(Shoe shoe){
        if(shoe.getSize()==size){
            return true;
        }
        return false;
    }


}
