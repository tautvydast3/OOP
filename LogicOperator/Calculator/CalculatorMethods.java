package LogicOperator.Calculator;


public class CalculatorMethods {

    // region Pirma uzduotis
    void isEqual(int userInput) {
        if (userInput % 2 == 0) {
            System.out.println("It is equal.");
        } else {
            System.out.println("It is not equal.");
        }
    }
//endregion

    // region Antra Uzduotis
    void findLabas(String txt) {
        if (txt.contains("labas")) {
            System.out.println("Laba diena");
        } else {
            System.out.println("Nelabai, ar ne?");
        }
    }
//endregion

    // region Trecia uzduotis
    void useX(double x) {

        if (x == 0) {
            System.out.println("Your input number is zero.");
        } else {
            double res = (x > 0) ? (positive(x)) : (negative(x));
            System.out.println(res);
        }

    }

    double positive(double x) {
        return 2 * x + 8;
    }

    double negative(double x) {
        return 21 - 7 * x;
    }
//endregion

    //Ketvirta uzduotis
    void useCalculator(String condition) {
        String operator = findOperator(condition);
        int indexOfOperator = condition.indexOf(operator);
        double numberA = findA(condition, indexOfOperator);
        double numberB = findB(condition, indexOfOperator);


        if (operator.equals("/") && numberB == 0) {
            System.out.println("Division by zero is denied");
        } else {
            System.out.printf("%s%s%s=%s", numberA, operator, numberB,
                    result(operator, numberA, numberB));
        }

    }

    private String findOperator(String operator) {
        if (operator.contains("+")) {
            return "+";
        } else if (operator.contains("-")) {
            return "-";
        } else if (operator.contains("/")) {
            return "/";
        } else if (operator.contains("*")) {
            return "*";
        }
        return operator;
    }

    private double findA(String condition, int indexOfOperator) {
        double a = Double.parseDouble(condition.substring(0, indexOfOperator));
        return a;
    }

    private double findB(String condition, int indexOfOperator) {
        double b = Double.parseDouble(condition.substring(indexOfOperator + 1, condition.length()));
        return b;
    }

    private double result(String operator, double a, double b) {
        double sum = 0;
        switch (operator) {
            case "+":
                sum = a + b;
                break;
            case "-":
                sum = a - b;
                break;
            case "/":
                sum = a / b;
                break;
            case "*":
                sum = a * b;
                break;
        }
        return sum;
    }

}
