package Loop;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        LotteryMethod lotteryMethod = new LotteryMethod();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your ticket number >");
        String ticketNumberString = scanner.nextLine();
        Integer[] ticketNumber = new Integer[6];

        for (int i = 0; i < ticketNumber.length; i++) {
            ticketNumber[i] = (int) ticketNumberString.charAt(i);
        }

        lotteryMethod.checkUserNumber(ticketNumber);
    }
}
