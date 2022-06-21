abstract class Ticket {
    public String Name;
    public Ticket(String n)
    {
        this.Name = n;
    }
    public String getName() {
        return Name;
    }

    protected void setName(String name) {
        Name = name;
    }
    public abstract int GetCost();
}