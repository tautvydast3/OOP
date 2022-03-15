package Loop;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        TaskEightMethod taskEightMethod = new TaskEightMethod();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kokio ilgio masyvo noresite?");
        Integer[] array = new Integer[scanner.nextInt()];

        taskEightMethod.arrayMethod(array);

    }
}
