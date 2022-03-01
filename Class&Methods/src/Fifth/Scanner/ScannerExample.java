package Fifth.Scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Iveskite salyga > ");
        String salyga = scanner.nextLine();

        ScannerExampleMethod scannerExampleMethod = new ScannerExampleMethod();

        scannerExampleMethod.rezultatas(salyga);
    }
}
