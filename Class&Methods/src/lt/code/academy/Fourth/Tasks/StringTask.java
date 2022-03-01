package lt.code.academy.Fourth.Tasks;

public class StringTask {
    public static void main(String[] args) {
        String tekstas = "Kazkoks tekstas";


        System.out.printf("%s\n%s\n", StringTaskMethods.capitalLetters(tekstas), StringTaskMethods.countLetters(tekstas));
    }
}
