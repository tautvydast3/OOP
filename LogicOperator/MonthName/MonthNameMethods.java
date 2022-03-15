package LogicOperator.MonthName;

public class MonthNameMethods {
    void month(int monthNumb) {
            if  (monthNumb <= 0 || monthNumb > 12) {
                System.out.println("Invalid number");


            } else {
                if (monthNumb % 2 != 0) {
                    switch (monthNumb) {
                        case 1: {
                            System.out.println("January");
                            break;
                        }
                        case 3: {
                            System.out.println("March");
                            break;
                        }
                        case 5: {
                            System.out.println("May");
                            break;
                        }
                        case 7: {
                            System.out.println("July");
                            break;
                        }
                        case 9: {
                            System.out.println("September");
                            break;
                        }
                        case 11: {
                            System.out.println("November");
                            break;
                        }
                    }

                } else {
                    switch (monthNumb) {
                        case 2: {
                            System.out.println("February");
                            break;
                        }
                        case 4: {
                            System.out.println("April");
                            break;
                        }
                        case 6: {
                            System.out.println("June");
                            break;
                        }
                        case 8: {
                            System.out.println("August");
                            break;
                        }
                        case 10: {
                            System.out.println("October");
                            break;
                        }
                        case 12: {
                            System.out.println("December");
                            break;
                        }
                    }
                }
            }
    }
}
