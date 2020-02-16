package academy.everyonecodes.java.optionals.enums.exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Drawer {

    public Outfit getOutfitForToday(Month month, DayOfWeek day) {
        Socks sock = getSocks(day);
        Headpiece head = getHeadPiece(month);
        return new Outfit(sock, head);

    }

     private Socks getSocks(DayOfWeek day) {
        if(day.getValue() == 1){
            return Socks.REDSOCKS;
        }if (day.getValue() == 6 || day.getValue() == 7){
            return Socks.GREENSOCKS;
        }
        return Socks.YELLOWSOCKS;
        }


    private Headpiece getHeadPiece(Month month) {
        if (month.getValue() >=3 && month.getValue()<=10) {
            return Headpiece.HAT;
        } else {
            return Headpiece.BEANIE;
        }
    }
}