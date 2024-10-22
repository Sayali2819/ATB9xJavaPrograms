package Oct.ex_22102024;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String st = sc.nextLine();

        boolean isPalindrome = true;

        String inputString = st.toLowerCase();
        int length = inputString.length();

        for (int i = 0; i < length / 2; i++)
        {
            if (inputString.charAt(i) != inputString.charAt(length - i - 1))
            {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }



    }
}
