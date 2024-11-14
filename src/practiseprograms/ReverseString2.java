package practiseprograms;

import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = sc.nextLine();
        int len = input.length();
        String rev = " ";

        //Convert String to char array
        char[] input1 = input.toCharArray();

        for(int i=len-1; i>=0; i--)
        {
            rev += input1[i];
        }
        System.out.println("Reverse String:" +rev);

    }
}
