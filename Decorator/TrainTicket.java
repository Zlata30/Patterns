public class TrainTicket extends Ticket{
    public TrainTicket() {
        super("Квиток на потяг");
    }

    @Override
    public int GetCost() {
        return 500;
    }
}
