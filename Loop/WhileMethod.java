package Loop;

import java.util.Scanner;

public class WhileMethod {
    void negativeStop() {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        String positive = "Please provide positive number: ";

        System.out.println(positive);
        while (b == scanner.nextInt() > 0) {
            System.out.println(positive);
        }
        System.out.println("Stop being so negative");
    }
}
