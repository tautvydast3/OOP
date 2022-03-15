package Loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        PalindromeMethod palindromeMethod = new PalindromeMethod();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Provide me a polindrome, please > ");

            String userPalindrome = scanner.nextLine();

            palindromeMethod.palindrome(userPalindrome);

            System.out.println("**********");

        }
    }
}
