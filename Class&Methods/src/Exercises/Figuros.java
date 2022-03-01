package Exercises;
import java.util.Scanner;

public class Figuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Iveskite 'a' krastines ilgi > ");
        double plotis = scanner.nextDouble();

        System.out.print("Iveskite 'b' krastines ilgi > ");
        double aukstis = scanner.nextDouble();


            FiguruFormules statusisTrikampis = new FiguruFormules("Statusis trikampis", plotis, aukstis);
            FiguruFormules staciakampis = new FiguruFormules("Staciakampis", plotis, aukstis);
            FiguruFormules kvadratas = new FiguruFormules("Kvadratas", plotis);
            FiguruFormules apskritimas = new FiguruFormules("Apskritimas", plotis);


        System.out.printf("Figuros %s plotas yra: %s\n" +
                        "Figuros %s plotas yra: %s\n" +
                        "Figuros %s plotas: %s\n" +
                        "Figuros %s plotas: %s\n",
                statusisTrikampis.pavadinimas,
                statusisTrikampis.printStatusisTrikampis(),
                staciakampis.pavadinimas,
                staciakampis.printStaciakampis(),
                kvadratas.pavadinimas,
                kvadratas.printKvadratas(),
                apskritimas.pavadinimas,
                apskritimas.printApskritimas());
    }

}
