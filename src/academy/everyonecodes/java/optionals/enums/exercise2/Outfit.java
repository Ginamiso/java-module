package academy.everyonecodes.java.optionals.enums.exercise2;

import jdk.jfr.Description;

public class Outfit {
    private Socks sock;
    private HeadPiece headPiece;

    public Outfit(Socks sock, HeadPiece headPiece){
        this.sock = sock;
        this.headPiece = headPiece;
    }
    public String getDescription(){
        String sockDescription = sock.getDescription();
        String headDescription = headPiece.getDescription();
        return  headDescription +" hat and "+ sockDescription;

    }

}
