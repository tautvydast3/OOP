package Loop;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek skaiciu norite sukurti?");
        Integer[] userArray = new Integer[scanner.nextInt()];

        RandomNumbMethod randomNumbMethod = new RandomNumbMethod();

        userArray = randomNumbMethod.createNumbers(userArray);

        System.out.println("Jusu masyvo skaiciai yra: ");
        System.out.println(Arrays.toString(userArray));
        System.out.println("Jusu masyvo didziausias skaicius yra: ");
        System.out.println(String.valueOf(randomNumbMethod.biggestNumb(userArray)));

    }
}
