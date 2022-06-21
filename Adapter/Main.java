public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Pen pen = new Pen();
        student.DoHomework(pen);
        Keyboard keyboard = new Keyboard();
        IPen keyboardHomework = new KeyboardToPenAdapter(keyboard);
        student.DoHomework(keyboardHomework);
    }
}