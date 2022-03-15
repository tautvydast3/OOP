package Loop;

import java.util.Arrays;
import java.util.Scanner;

public class RemArrElm {
    public static void main(String[] args) {
        RemArrElmMethod remArrElmMethod = new RemArrElmMethod();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[]{13, 25, 37, 49, 51, 62, 74, 86, 98, 0};
        System.out.println(Arrays.toString(array));
        System.out.println("Write number you want to remove from array >");
        Integer userNumb = scanner.nextInt();

        array = remArrElmMethod.removeNumber(array, userNumb);

        System.out.println(Arrays.toString(array));
    }
}
