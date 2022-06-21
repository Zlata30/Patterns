abstract class TicketDecorator extends Ticket{
    protected Ticket ticket;

    public TicketDecorator(String n, Ticket ticket) {
        super(n);
        this.ticket = ticket;
    }
}
