package Loop;

import java.util.Arrays;

public class PalindromeMethod {
    void palindrome(String userPalindrome) {
        userPalindrome = userPalindrome.replaceAll(" ", "");
        char[] regSent = new char[userPalindrome.length()];
        char[] bacSent = new char[userPalindrome.length()];

        int bacCount = userPalindrome.length() - 1;

        for (int i = 0; i < userPalindrome.length(); i++) {
            regSent[i] = userPalindrome.charAt(i);
            bacSent[i] = userPalindrome.charAt(bacCount--);
        }
        if (Arrays.equals(regSent, bacSent)) {
            System.out.println("This is definitely a palindrome!");
        } else {
            System.out.println("This is not a palindrome, I'm sorry.");
        }
    }
}
