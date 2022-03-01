package lt.code.academy.Second;

public class OverloadingExample {
    public static void main(String[] args) {
        OverloadingExample overloadingExample = new OverloadingExample();
        int intSum = overloadingExample.sum(10, 5);
        double doubleSum = overloadingExample.sum(55.5, 100.55);

        System.out.println(intSum);
        System.out.println(doubleSum);
    }
    public int sum(int numb, int secondNumb) {
        return numb + secondNumb;
    }
    public double sum(double numb, double secondNumb) {
        return numb + secondNumb;
    }
}
