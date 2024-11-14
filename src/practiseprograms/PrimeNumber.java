package practiseprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num  = sc.nextInt();

        if(num == 0 || num ==1)
        {
            System.out.println("Enter a number greater than 1!");
        }
        else if(num == 2)
        {
            System.out.println("Prime Number!");
        }
        else if(num>2)
        {

        }
    }
}
