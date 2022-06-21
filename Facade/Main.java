public class Main {
    public static void main(String[] args) {
        MakeUp makeUp = new MakeUp();
        MakeHairStyle hairStyle = new MakeHairStyle();
        Dress outfit = new Dress();
        Facade facade = new Facade(makeUp,hairStyle,outfit);
        Girl girl = new Girl();
        girl.PrepareForDate(facade);
    }
}