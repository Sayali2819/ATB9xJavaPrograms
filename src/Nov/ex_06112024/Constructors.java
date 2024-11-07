package Nov.ex_06112024;

import java.util.Scanner;

public class Constructors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();
        System.out.println(c1.model);
        System.out.println(c1.name);
        System.out.println(c1.year);

        Car nano = new Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);

        Car2 c2 = new Car2("tesla", 2015);
        c2.display();

        Car2 c3 = new Car2("Grand Vitara", 2020);
        c3.display();

        System.out.println("Enter model name:");
        String model_name = sc.nextLine();
        System.out.println("Enter year:");
        int year = sc.nextInt();

        Car2 c4 = new Car2(model_name, year);
        c4.display();

        Car2 c5 = new Car2("Mahindra");
        c5.display();


    }
}

class Car2{
    String model;
    int year;

    Car2(String model, int year)
    {
//        System.out.println("Model Name:" +model);
//        System.out.println("Year:" +year);
        this.model = model;
        this.year = year;
        System.out.println("Parameterized Constructor");
    }

    //Constructor overloading
    Car2(String model)
    {

        this.model = model;
        System.out.println("Model:" + model);
    }

    void display()
    {
        System.out.println("Car2 Details :" + this.model +"-"+ this.year);
    }
}