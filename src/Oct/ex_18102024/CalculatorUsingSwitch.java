package Oct.ex_18102024;

import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Select which operation to be perform: 1.Addition 2.Subtraction 3.Multiplication 4.Division");
        int operation = sc.nextInt();

        int result = 0;

        switch (operation)
        {
            case 1:
                result = num1 + num2;
                break;

            case 2:
                result = num1 - num2;
                break;

            case 3:
                result = num1 * num2;
                break;

            case 4:
                if(num2 > 0)
                {
                    result = num1 / num2;
                }
                else
                {
                    System.out.println("Denominator cannot be 0");
                }
                break;

            default:
                System.out.println("Invalid operation!");
        }
        System.out.println("Result:" + result);
        sc.close();
    }
}
