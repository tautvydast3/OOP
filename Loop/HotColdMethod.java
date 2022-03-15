package Loop;

import java.util.Scanner;

public class HotColdMethod {
    void game(Integer randomNumb) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Atspekite skaiciu nuo vieno iki 100 ");

        for (int i = 0; i < 10; i++){
            System.out.printf("Bandymas numeris %s >\n", i+1);
            int userTry = scanner.nextInt();
            if (randomNumb == userTry){
                System.out.printf("Atspejote! Tai skaicius %s.", randomNumb);
                break;
            } else {
                if (userTry > randomNumb){
                    System.out.println("Jusu skaicius yra per didelis.");
                } else {
                    System.out.println("Jusu skaicius yra per mazas.");
                }
            }
        }
    }
}
