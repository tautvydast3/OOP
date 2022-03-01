package third.repeat;

public class FirstTask {
    double price = 100.5;
    int count = 0;

    public static void main(String[] args) {
        FirstTask firstTask = new FirstTask();
        SecondClass secondClass = new SecondClass();

        printPrice(firstTask.price);

        System.out.printf("Pries %s \n", firstTask.count);
        firstTask.increaseCount();
        System.out.printf("Po %s \n", firstTask.count);

        firstTask.increaseCustomCount(10);
        System.out.printf("Po custom increase %s\n", firstTask.count);

        SecondClass.printName("Povilas");
        secondClass.printAge(12);
    }

    public static void printPrice(double price) {
        System.out.println(price);
    }

    public void increaseCount(){
        count++;
    }

    public void increaseCustomCount(int countIncrease){
        count += countIncrease;
    }
}
