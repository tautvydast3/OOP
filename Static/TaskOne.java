package Static;

public class TaskOne {
    private int i;

    public void setValue(int i) {
        System.out.println(i);
    }

    public static void staticMethod(int j) {
        System.out.println(j);
//        i = j;
    }
}