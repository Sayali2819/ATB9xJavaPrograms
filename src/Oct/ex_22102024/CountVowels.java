package Oct.ex_22102024;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String st = sc.nextLine();

        String value = st.toLowerCase();

        int vowels = 0, consonants = 0;

        for(int i=0; i<value.length(); i++)
        {
            char ch = value.charAt(i);

            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u' )
            {
                vowels ++;
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                consonants++;
            }

        }

        System.out.println("Count of Vowels : "+vowels);
        System.out.print("Count of Consonants : " +consonants);

        sc.close();
    }

}
