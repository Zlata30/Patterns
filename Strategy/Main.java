import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Context context = new Context();
        System.out.println("Оберіть стейк якої прожарки ви бажаєте приготувати: ");
        System.out.println("1.Приготувати стейк прожарки rare");
        System.out.println("2.Приготувати стейк прожарки medium");
        System.out.println("3.Приготувати стейк прожарки well done");
        int oper = scanner.nextInt();

        switch (oper){
            case 1:
                context.setStrategy(new RareSteak());
                context.cookStrategy();
                break;
            case 2:
                context.setStrategy(new MediumSteak());
                context.cookStrategy();
            case 3:
                context.setStrategy(new WellDoneSteak());
                context.cookStrategy();
            default:
                System.out.println("Такої операції немає");
        }
    }
}