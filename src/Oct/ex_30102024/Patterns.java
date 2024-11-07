package Oct.ex_30102024;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Reverse Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.print("*" + " ");
                }

            }
            System.out.println(" ");
        }

    }

}
