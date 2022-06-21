public class Pasta extends Cooking{
    @Override
    protected void WashProducts() {
        System.out.println("Помити овочі для пасти");
    }

    @Override
    protected void CutProducts() {
        System.out.println("Нарізати тісто для пасти");
    }

    @Override
    protected void ProcessProducts() {
        System.out.println("Відварити пасту");
    }

    @Override
    protected void MakeDish() {
        System.out.println("Приготувати пасту з овочами");
    }
}
