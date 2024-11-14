package practiseprograms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = sc.nextLine();

        String rev = "";
        int len = input.length();

        for(int i=len-1; i>=0; i--)
        {
           rev += input.charAt(i);
         }
        System.out.println("Input String: " +input);
        System.out.println("Reverse String: " +rev);
    }
}
