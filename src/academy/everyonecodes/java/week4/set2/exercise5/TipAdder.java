package academy.everyonecodes.java.week4.set2.exercise5;

public class TipAdder {
    public double add(double bill) {
        double tip = bill*0.05;
        double billPlusTip = bill + tip;
        double billPlusTipRoundDown = Math.floor(billPlusTip);
        double decimals = (billPlusTip - billPlusTipRoundDown)*100;
        double decimalsRoundDown = Math.floor(decimals);
        if(decimalsRoundDown < 50){
            return billPlusTipRoundDown +0.5;
        }else{
            return Math.ceil(billPlusTip);
        }

    }
}
