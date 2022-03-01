package Fifth;

public class FirstTaskMethods {
    public static void numbInput(Integer numb){
        System.out.println("Jus ivedete skaiciu " + numb);
    }

    public static void numbSum(Integer a, Integer b) {
        Integer s = a + b;
        System.out.println(a + " + " + b + " = " + s);
    }
    public static void numbAvg(Integer a, Integer b) {
        double s = (a.doubleValue() + b.doubleValue()) / 2;
        System.out.println("Average number is " + s);
    }

    public static void numbSwitch(Integer a, Integer b) {
        Integer a1 = b;
        b = a;
        a = a1;
        System.out.println("Variable a now is " + a + "\nVariable b now is " + b);
    }

    public static void numbFourDigits(Integer numb){
        String s = numb.toString();
        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
    String changeOne(String text, char oldLetter, char newLetter){
        String changed = text.replace(oldLetter, newLetter);
        System.out.printf("\"%s\" -> \"%s\"\n", text, changed);

        return changed;
    }
    String changeTwo(String text){
        String changed = text.toUpperCase();
        System.out.printf("\"%s\" -> \"%s\"\n", text, changed);

        return changed;
    }
    String changeThree(String text){
        String changed = text.substring(2,4);
        System.out.printf("\"%s\" -> \"%s\"\n", text, changed);

        return changed;
    }
    String changeFour(String text){
        String changed = text.concat(text.toLowerCase());
        System.out.printf("\"%s\" -> \"%s\"\n", text, changed);

        return changed;
    }
    String changeFive(String text, char letter){
        System.out.printf("\"%s\" -> \"%s\"\n", text, text.indexOf(letter));
        return Integer.valueOf(letter).toString();
    }

}
