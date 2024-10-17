package Oct.ex_17102024;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1 length of triangle :");
        int side1 = sc.nextInt();

        System.out.println("Enter side2 length of triangle :");
        int side2 = sc.nextInt();

        System.out.println("Enter side1 length of triangle:");
        int side3 = sc.nextInt();

        if( (side1 == side2)  && (side2 == side3))
        {
            System.out.println("Equilateral Triangle!");
        }
        else if((side1 == side2) || (side1 == side3) || (side2 == side3))
        {
            System.out.println("Isosceles Triangle!");
        }
        else
        {

            System.out.println("Scalene Triangle!");
        }
    }
}
