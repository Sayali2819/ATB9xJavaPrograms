package Oct.ex_16102024;

import java.util.Scanner;

public class TakeUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = sc.next();

        System.out.println("Enter your Age:");
        int age = sc.nextInt();

        System.out.println("Enter your Salary:");
        float salary = sc.nextFloat();

        System.out.println(name + " " + age + " " + salary);


    }
}
