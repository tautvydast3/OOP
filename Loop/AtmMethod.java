package Loop;

import java.util.Scanner;

public class AtmMethod {

    void accountLogic(Double accountDeposit) {

//        Jusu saskaitoje yra tokia suma pinigu
        System.out.printf("Jusu saskaitoje yra %s \n", accountDeposit);
        Double withdraw = accountWithdraw();

        if (withdraw < accountDeposit) {
            accountDeposit = takeLess(withdraw, accountDeposit);
            accountLogic(accountDeposit);
        } else {
            takeMore(withdraw, accountDeposit);
        }
    }

    //    Iveda kiek pinigu nori nusiimti
    private Double accountWithdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek  norite nusiimti?");
        return scanner.nextDouble();
    }

    //    Pasiima maziau nei yra saskaitoje
    private Double takeLess(Double withdraw, Double accountDeposit) {
        accountDeposit = accountDeposit - withdraw;
        return accountDeposit;
    }


    //    Pasiima daugiau nei yra saskaitoje
    private void takeMore(Double withdraw, Double accountDeposit) {

        for (int i = 0; i < 3; i++) {
            if (withdraw < accountDeposit) {
                accountDeposit = accountDeposit - withdraw;
                accountLogic(accountDeposit);
            } else if (withdraw > accountDeposit & i == 2) {
                System.out.printf("""
                        Jus ivedete %s, tai per didele suma.\s
                        Jus isnaudojote visus bandymus.\s
                        Jusu saskaitoje yra %s pinigu.\s
                        Geros dienos.""", withdraw, accountDeposit);
                break;
            } else if (withdraw > accountDeposit) {
                System.out.printf("""
                        Jus ivedete %s, tai per didele suma.\s
                        Jusu saskaitoje yra %s pinigu.
                        Liko %s bandymai.
                        """, withdraw, accountDeposit, 2 - i);
            } else {
                System.out.println("Jusu saskaitoje yra 0. \nGeros dienos.");
                break;
            }
            if (accountDeposit != 0) {
                withdraw = accountWithdraw();
            }
        }
    }
}

