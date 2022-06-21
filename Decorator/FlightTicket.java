public class FlightTicket extends Ticket{

    public FlightTicket() {
        super("Квиток на літак");
    }

    @Override
    public int GetCost() {
        return 1000;
    }
}
