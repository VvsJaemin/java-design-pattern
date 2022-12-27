package singleton;

public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker singleton = new TicketMaker();
    public TicketMaker() {
        System.out.println("티켓 발권");
    }

    public static TicketMaker getInstance() {
        return singleton;
    }

    public synchronized int getTicket() {
        return ticket++;
    }

}
