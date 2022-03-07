package LogicOperator.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculatorMethods calculatorMethods = new CalculatorMethods();

        //region Pirma uzduotis
//        System.out.println("Input number >");
//        int userInput = scanner.nextInt();
//
//        calculatorMethods.isEqual(userInput);
//endregion

        //region Antra uzduotis
//        System.out.println("Iveskite teksta >");
//        String txt = scanner.nextLine();
//
//        calculatorMethods.findLabas(txt);
//endregion

        //region Trecia uzduotis
//        System.out.println("Input number x >");
//        double numberX = scanner.nextDouble();
//
//        calculatorMethods.useX(numberX);
//endregion

        //Ketvirta uzduotis

        System.out.println("Enter your condition >");
        String condition = scanner.nextLine();

        calculatorMethods.useCalculator(condition);


    }
}
