package lt.code.academy.Fourth.Tasks;

public class FirstTask {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.name = "Povilas";
//        person.surname = "Meškėla";

        Person person = new Person("Povilas","Meškėla", 50);
//        System.out.println(person.getName());
//        System.out.println(person.getSurname());

        person.setAge(69);
        System.out.println(person);
    }
}
