package singleton;

public class TicketMain {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("TicketMaker.getInstance().getTicket() = " + TicketMaker.getInstance().getTicket());
        }
    }
}
