public class TriangleDeveloper extends Developer{
    public TriangleDeveloper(String n){
        super(n);
    }

    @Override
    public Figure Create() {
        return new Triangle();
    }


}
