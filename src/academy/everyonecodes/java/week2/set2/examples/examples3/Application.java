package academy.everyonecodes.java.week2.set2.examples.examples3;

public class Application {
    public static void main(String[] args) {
        MovieNamePrinter movieNamePrinter = new MovieNamePrinter();
        TicketPrinter ticketPrinter = new TicketPrinter(movieNamePrinter);
        ticketPrinter.print("titanic", "20.12.1997");
    }
}
