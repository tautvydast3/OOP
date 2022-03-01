package Fifth;

public class FirstTask {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner (System.in);
//
//        System.out.print("Iveskite pirmaji skaiciu > ");
//        Integer numb1 = scanner.nextInt();
//        System.out.print("Iveskite antraji skaiciu > ");
//        Integer numb2 = scanner.nextInt();



//        FirstTaskMethods.numbInput(numb1);

//        FirstTaskMethods.numbSum(numb1, numb2);

//        FirstTaskMethods.numbAvg(numb1, numb2);

//        FirstTaskMethods.numbSwitch(numb1, numb2);

//        FirstTaskMethods.numbFourDigits(numb1);

        FirstTaskMethods firstTaskMethods = new FirstTaskMethods();
        String text = "Namas";

        text = firstTaskMethods.changeOne(text, 's', 'i');
        text = firstTaskMethods.changeTwo(text);
        text = firstTaskMethods.changeThree(text);
        text = firstTaskMethods.changeFour(text);
        text = firstTaskMethods.changeOne(text, 'm', 'n');
        text = firstTaskMethods.changeFive(text, 'n');
    }
}
