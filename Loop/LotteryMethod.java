package Loop;

public class LotteryMethod {

    void checkUserNumber(Integer[] ticketNumber) {
        if (differentOrNot(ticketNumber)) {
            System.out.println("Your number is incorrect. Digits must be different.");
        } else {
            luckyOrNot(ticketNumber);
        }
    }

    boolean differentOrNot(Integer[] ticketNumber) {
        for (int i = 0; i < ticketNumber.length; i++) {
            for (int j = i + 1; j < ticketNumber.length; j++) {
                if (ticketNumber[i] == ticketNumber[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    void luckyOrNot(Integer[] ticketNumber) {
        int sumA = ticketNumber[0] + ticketNumber[1] + ticketNumber[2];
        int sumB = ticketNumber[3] + ticketNumber[4] + ticketNumber[5];

        if (sumA == sumB) {
            System.out.println("YOU WON");
        } else {
            System.out.println("YOU LOST");
        }
    }
}
