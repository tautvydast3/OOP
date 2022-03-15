package ArrayTask;

import java.util.Scanner;

public class LargeSmall {
    public static void main(String[] args) {
        LargeSmallMethod largeSmallMethod = new LargeSmallMethod();
        Scanner scanner = new Scanner(System.in);
        Integer[] array = new Integer[10];

        System.out.println("Enter your numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(largeSmallMethod.large(array));
        System.out.println(largeSmallMethod.small(array));
    }
}
