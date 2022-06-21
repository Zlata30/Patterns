public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new FlightTicket();
        ticket1 = new TicketBusinessClass(ticket1);
        System.out.println(ticket1.Name);
        System.out.println("Ціна: "+ ticket1.GetCost());

        Ticket ticket2 = new FlightTicket();
        ticket2 = new TicketEconomyClass(ticket2);
        System.out.println(ticket2.Name);
        System.out.println("Ціна: "+ ticket2.GetCost());

        Ticket ticket3 = new TrainTicket();
        ticket3 = new TicketBusinessClass(ticket3);
        System.out.println(ticket3.Name);
        System.out.println("Ціна: "+ ticket3.GetCost());

        Ticket ticket4 = new TrainTicket();
        ticket4 = new TicketEconomyClass(ticket4);
        System.out.println(ticket4.Name);
        System.out.println("Ціна: "+ ticket4.GetCost());
    }
}