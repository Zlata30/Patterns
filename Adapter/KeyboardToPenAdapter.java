public class KeyboardToPenAdapter implements IPen{
    Keyboard keyboard;
    public KeyboardToPenAdapter (Keyboard k){
        keyboard = k;
    }

    @Override
    public void write() {
        keyboard.print();
    }
}
