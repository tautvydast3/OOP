package Loop;

import java.util.Random;

public class HotCold {
    public static void main(String[] args) {
        Random random = new Random();
        HotColdMethod hotColdMethod = new HotColdMethod();
        Integer randomNumb = random.nextInt(100) + 1;

        hotColdMethod.game(randomNumb);
    }
}
