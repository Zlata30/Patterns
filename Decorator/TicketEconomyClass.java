public class TicketEconomyClass extends TicketDecorator{
    public TicketEconomyClass(Ticket t){
        super(t.Name +", економ клас", t);
    }
    @Override
    public int GetCost() {
        return ticket.GetCost() - 300;
    }
}
