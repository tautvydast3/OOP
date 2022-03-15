package Loop;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        AtmMethod atmMethod = new AtmMethod();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite suma kuria norite papildyti saskaita >");
        Double accountDeposit = scanner.nextDouble();

        atmMethod.accountLogic(accountDeposit);
    }
}
