package practiseprograms;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowels = 0;

        System.out.println("Enter a String:");
        String input = sc.nextLine();
        String lowerInput = input.toLowerCase();

        char[] ch = lowerInput.toCharArray();

        for(int i=0; i<lowerInput.length(); i++)
        {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' )
            {
               vowels++;
            }
        }
        if(vowels > 0)
        {
            System.out.println("Vowels are present!");
        }
        else
        {
            System.out.println("No Vowels present!");
        }
    }
}
