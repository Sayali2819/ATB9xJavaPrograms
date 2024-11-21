package Nov.ex_20112024;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y";
        while(continueInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter name:");
            String name = sc.nextLine();
            names.add(name);

            System.out.println("Enter age:");
            int age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("Do you want to enter another record: (Y/N)?");
            continueInput = sc.next();
        }

        System.out.println("\nNames: "+names);
        System.out.println("Ages: "+ages);
        sc.close();

    }
}
