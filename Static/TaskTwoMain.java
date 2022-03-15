package Static;

public class TaskTwoMain {
    public static void main(String[] args) {
        new TaskTwo();
        System.out.println(TaskTwo.count);
        new TaskTwo();
        new TaskTwo();
        new TaskTwo();
        new TaskTwo();

        TaskTwo.cleanUp();
        System.out.println(TaskTwo.count);

    }
}
