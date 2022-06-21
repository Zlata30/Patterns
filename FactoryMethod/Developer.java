abstract class Developer {
    public String Name ;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Developer (String n)
    {
        Name = n;
    }
    // фабричный метод
    abstract public Figure Create();
}
