package Loop;

import java.util.Arrays;

public class TaskEightMethod {
    void arrayMethod(Integer[] array) {
        for (int i = array.length - 1; i >= 0 ; i--){
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
