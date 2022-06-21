public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.Launch("Тетяна");
        System.out.println(person.name.Unique_name);

        // у нас не получится изменить имя, так как объект уже создан
        person.name = Name.getInstance("Микита");
        System.out.println(person.name.Unique_name);
    }
}