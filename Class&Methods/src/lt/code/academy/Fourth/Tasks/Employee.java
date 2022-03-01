package lt.code.academy.Fourth.Tasks;

public class Employee {
    private final String name;
    private final String surname;
    private int salary;
    private int workHours;



    public Employee(int salary, int workHours, String name, String surname){
        this.salary = salary;
        this.workHours = workHours;
        this.name = name;
        this.surname = surname;
    }
    public void increaseSalary(){
        salary += 10;
    }
    public void addWorkhours(int hours) {
        workHours += hours;
    }
    public String getEmployeeInfo() {
        return String.format("name: %s, surname: %s, hours: %s, salary: %s",name, surname, workHours, salary);
    }
}
