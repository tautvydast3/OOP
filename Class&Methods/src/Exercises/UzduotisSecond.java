package Exercises;

public class UzduotisSecond {
    public static void main(String[] args) {
        spausdink("Tautvydas", "Tevelis", "Java", 2);
        spausdink("Tautvydas", "Tevelis", "Java");

    }

    static void spausdink(String vardas, String pavarde, String kalba, int savaiciuSkaicius) {
        System.out.println("Aš, " + vardas + " " + pavarde + ", tikrai išmoksiu " +
                "programuoti " + kalba + "kalba per " + savaiciuSkaicius + " savaites");
    }

    static void spausdink(String vardas, String pavarde, String kalba) {
        System.out.printf("Aš, %s %s tikrai išmoksiu programuoti %s.", vardas, pavarde, kalba);
    }
}
