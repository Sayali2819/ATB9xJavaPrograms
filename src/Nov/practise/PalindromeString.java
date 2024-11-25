package Nov.practise;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String rev = "";
        System.out.println("Enter a String:");
        String inputStr = sc.nextLine();
        char[] input = inputStr.toCharArray();

        for(int i=inputStr.length()-1; i>=0; i--)
        {
            rev += input[i];

        }
        if(inputStr.equalsIgnoreCase(rev))
        {
            System.out.println("Palindrome!");
        }
        else
        {
            System.out.println("Not a Palindrome!");
        }

    }
}
