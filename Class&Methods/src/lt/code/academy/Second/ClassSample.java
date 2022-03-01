package lt.code.academy.Second;

public class ClassSample {
    static int age = 10;

    public static void main(String[] args) {
        int b = 5;
        System.out.println(age);


        // sukuriamas second class objektas
        SecondSampleClass secondSampleClass = new SecondSampleClass();
        System.out.println(secondSampleClass.size);
    }

//    public static void test() {
//        System.out.println(b);
//    }

}
