public class Person {
    public Name name ;
    public Name getname() {
        return name;
    }

    public void setname(Name name) {
        this.name = name;
    }

    public void Launch(String PersonName)
    {
        name = name.getInstance(PersonName);
    }
}
