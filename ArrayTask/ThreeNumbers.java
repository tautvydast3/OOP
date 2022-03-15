package ArrayTask;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];

        System.out.println("Enter your numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Your biggest number is: ");
        int big = Math.max(array[0], array[1]);
        int bigger = Math.max(big, array[2]);
        System.out.println(bigger);

        System.out.println("Your average number is: ");
        int avg = (array[0] + array[1] + array[2]) / array.length;
        System.out.println(avg);

        System.out.println("Kvadratu suma yra: ");
        double powsum = (Math.pow(array[0],2) + Math.pow(array[1],2) + Math.pow(array[2],2));
        System.out.println(Integer.valueOf((int) powsum));
    }

}



