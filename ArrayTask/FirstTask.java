package ArrayTask;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Pirma uzduotis
//        String[] mass = new String[10];
//        mass[0] = "Andrius";
//        String[] mas = {"Andrius", "Petras", "Jonas", "Antanas", "Ona"};
//        System.out.printf("%s-%s-%s\n", mas[0], mas[0].length(), 0);
//        System.out.printf("%s-%s-%s\n", mas[1], mas[1].length(), 1);
//        System.out.printf("%s-%s-%s\n", mas[2], mas[2].length(), 2);
//        System.out.printf("%s-%s-%s\n", mas[3], mas[3].length(), 3);
//        System.out.printf("%s-%s-%s\n", mas[4], mas[4].length(), 4);

        //Antra Uzduotis
        System.out.println("Iveskite skaiciu");
        int userInput = scanner.nextInt();
        int arrayLenght = arrayLenght(userInput);
        int[] intArray = new int[arrayLenght];
        intArray[0] = userInput;
        intArray[intArray.length - 1] = userInput;

        for (int i = 1; i < arrayLenght - 1; i++){
            intArray[i] = random.nextInt(-100,100);
        }

        System.out.println(Arrays.toString(intArray));

    }

    private static int arrayLenght(int userInput) {
        Random random = new Random();

        if (userInput > 7){
            return random.nextInt(1,7);
        }else {
            return userInput;
        }
    }
}
