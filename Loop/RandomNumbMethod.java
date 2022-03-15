package Loop;

import java.util.Random;

public class RandomNumbMethod {

    Integer[] createNumbers(Integer[] userArray) {
        Random random = new Random();
        int min = 1;
        int max = 100;
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = random.nextInt(max) + min;
        }
        return userArray;
    }

    Integer biggestNumb(Integer[] userArray) {
        Integer biggest = null;
        for (int i = 0; i < userArray.length; i++) {
            for (int j = i + 1; j < userArray.length; j++) {
                if (userArray[i] > userArray[j]) {
                    biggest = userArray[i];
                } else {
                    biggest = userArray[j];
                }
            }
        }
        return biggest;
    }
}
