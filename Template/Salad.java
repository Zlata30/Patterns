public class Salad extends Cooking{
    @Override
    protected void WashProducts() {
        System.out.println("Помити овочі");
    }

    @Override
    protected void CutProducts() {
        System.out.println("Нарізати овочі");
    }

    @Override
    protected void ProcessProducts() {
        System.out.println("Термічно обробити овочі");
    }

    @Override
    protected void MakeDish() {
        System.out.println("Зробити салат");
    }
}
