package academy.everyonecodes.java.optionals.enums.exercise2;

import javax.swing.*;
import java.time.DayOfWeek;
import java.time.Month;
import java.util.List;

public class Drawer {

    public Outfit getOutfitForToday(Month month, DayOfWeek day) {
        Socks sock = getSocks(day);
        HeadPiece head = getHeadPiece(month);
        return new Outfit(sock, head);

    }

     private Socks getSocks(DayOfWeek day) {
        if(day.getValue() == 1){
            return Socks.REDSOCKS;
        }else if (day.getValue() >= 2 && day.getValue() <= 5){
            return Socks.GREENSOCKS;
        }
        return Socks.YELLOWSOCKS;
        }


    private HeadPiece getHeadPiece(Month month) {
        if (month.getValue() >=3 && month.getValue()<=10) {
            return HeadPiece.HAT;
        } else {
            return HeadPiece.BEANIE;
        }
    }
}