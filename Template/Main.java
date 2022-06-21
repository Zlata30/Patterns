import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть страву для приготування");
        System.out.println("1. Салат");
        System.out.println("2. Паста");
        int operation = scanner.nextInt();
        switch (operation){
            case 1:
                Salad salad = new Salad();
                salad.CookingProcess();
                break;
            case 2:
                Pasta pasta = new Pasta();
                pasta.CookingProcess();
        }
    }
}