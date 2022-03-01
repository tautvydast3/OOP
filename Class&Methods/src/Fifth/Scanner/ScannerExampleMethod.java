package Fifth.Scanner;

import javax.management.StringValueExp;

import static java.lang.String.valueOf;

public class ScannerExampleMethod {
    void rezultatas(String salyga) {
        String aString = salyga.substring(0,2);
        String bString = salyga.substring(3,5);
        int a = Integer.parseInt(aString);
        int b = Integer.parseInt(bString);
        char operator = salyga.charAt(2);

        System.out.println(a + String.valueOf(operator) + b);
    }

}
