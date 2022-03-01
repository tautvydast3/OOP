package lt.code.academy.Second;

public class MethodExample {
    public static void main(String[] args) {
        MethodExample methodExample = new MethodExample();
        methodExample.firstMethod();

        double speed = StaticMethodsInAnotherClass.getSpeed();
        System.out.println(speed);

    }

    public void firstMethod(){
        System.out.println("Iskviestas");

        int age = getAge();
        System.out.println(age);
        System.out.println(getAge());
        printUserAge(age);

        System.out.println(StaticMethodsInAnotherClass.getSpeed());
    }

    public int getAge() {
        return 100;
    }

    public void printUserAge(int age){
        System.out.println(age);
    }
}
