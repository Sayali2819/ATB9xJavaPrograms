package Oct.ex_22102024;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int rev = 0;

        for(; num != 0; num /= 10)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
        }

        System.out.printf("Reverse of %d : %d", num, rev);

        sc.close();
    }
}
