package academy.everyonecodes.java.week2.set2.examples.examples3;

public class TicketPrinter {

    private MovieNamePrinter movieNamePrinter;

    public TicketPrinter(MovieNamePrinter movieNamePrinter){
        this.movieNamePrinter = movieNamePrinter;
    }
    public void print(String title, String date){
        movieNamePrinter.print(title);
        System.out.println("["+date+"]");
    }

}
