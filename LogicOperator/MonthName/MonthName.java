package LogicOperator.MonthName;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input month's number >");
        int monthNumber = scanner.nextInt();

        MonthNameMethods monthNameMethods = new MonthNameMethods();

        monthNameMethods.month(monthNumber);
    }
}
