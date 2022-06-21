public class Name {
    private static Name instance;

    public String Unique_name ;

    public String getUnique_name() {
        return Unique_name;
    }

    private void setunique_name(String unique_name) {
        Unique_name = unique_name;
    }
    protected Name(String unique_name)
    {
        this.Unique_name=unique_name;
    }

    public static Name getInstance(String unique_name) {
        if (instance == null)
            instance = new Name(unique_name);
        return instance;
    }
}
