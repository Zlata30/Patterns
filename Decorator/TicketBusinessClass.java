public class TicketBusinessClass extends TicketDecorator{
    public TicketBusinessClass(Ticket t){
        super(t.Name +", бізнес клас", t);
    }
    @Override
    public int GetCost() {
        return ticket.GetCost() + 1000;
    }
}
