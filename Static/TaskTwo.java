package Static;

public class TaskTwo {
    public static int count;

    public TaskTwo(){
        System.out.printf("Reiksme %s\n", count++);
    }
    public static void cleanUp(){
        System.out.printf("Reiksme pries isvalant %s\n", count);
        count = 0;
    }
}
