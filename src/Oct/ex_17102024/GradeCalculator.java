package Oct.ex_17102024;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = sc.nextInt();

        if(score >= 90 && score <= 100)
        {
            System.out.println("Grade : A");
        }
        else if(score <= 89 && score >= 80)
        {
            System.out.println("Grade : B");
        }
        else if(score <= 79 && score >= 70)
        {
            System.out.println("Grade : C");
        }
        else if(score <= 69 && score >= 60)
        {
            System.out.println("Grade : D");
        }
        else if(score <= 59 && score >= 0)
        {
            System.out.println("Grade : F");
        }
        else
        {
            System.out.println("Invalid Score!");
        }

    }
}
