public class Main {
    public static void main(String[] args) {
        Developer dev = new TriangleDeveloper("Будівельник трикутників");
        Figure figure1 = dev.Create();
        dev = new RectangleDeveloper("Будівельник прямокутників");
        Figure figure2 = dev.Create();
    }
}