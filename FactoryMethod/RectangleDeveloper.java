public class RectangleDeveloper extends Developer{

    public RectangleDeveloper(String n) {
        super(n);
    }

    @Override
    public Figure Create() {
        return new Rectangle();
    }
}
