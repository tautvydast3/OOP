package ArrayTask;

public class LargeSmallMethod {
    String large(Integer[] array) {
        int large = array[0];
        for (int j : array) {
            large = Math.max(large, j);
        }
        return "Your biggest number is: " + large;
    }

    String small(Integer[] array) {
        int small = array[0];
        for (int j : array) {
            small = Math.min(small, j);
        }
        return "Your smallest number is: " + small;
    }
}
