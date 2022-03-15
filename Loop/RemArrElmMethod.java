package Loop;

import java.util.Arrays;
import java.util.Objects;

public class RemArrElmMethod {

    int[] removeNumber(int[] array, int remNumb) {
        String tempArray = "";
        for (Integer integer : array) {
            if (!Objects.equals(integer, remNumb)) {
                tempArray = tempArray + integer + ",";
            }
        }
        int[] numbers = Arrays.stream(tempArray.split(",")).mapToInt(Integer::parseInt).toArray();
        return numbers;
    }
}
