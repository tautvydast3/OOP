package lt.code.academy.Fourth.Tasks;

public class SecondTask {
    public static void main(String[] args) {
        Employee petras = new Employee(5000, 110, "Petras", "Petraitis");
        Employee antanas = new Employee(0, 0, "Antanas", "Antanaitis");


        petras.addWorkhours(10);
        petras.increaseSalary();
        petras.increaseSalary();

        System.out.println(petras.getEmployeeInfo());
        System.out.println(antanas.getEmployeeInfo());
    }
}
