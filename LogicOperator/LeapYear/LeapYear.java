package LogicOperator.LeapYear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Leap year or common? >");

        int year = scanner.nextInt();
        String common = "Common year";
        String leap = "Leap year";

        if (year % 4 != 0) {
            System.out.println(common);
        } else if (year % 100 != 0) {
            System.out.println(leap);
        } else if (year % 400 != 0) {
            System.out.println(common);
        } else {
            System.out.println(leap);
        }
    }
}
