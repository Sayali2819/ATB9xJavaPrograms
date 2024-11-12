package Nov.ex_12112024;

public class SuperKeyword {
    public static void main(String[] args) {
        Car c1 = new Car();
//        c1.display();
//        c1.message();

    }
}

class  Car extends Vehicle
{
    private int maxSpeed = 281;

    @Override
    void display() {

        System.out.println("Child Method!");
    }

    Car()
    {
        super(10);
        System.out.println("DC Car");
        System.out.println(this.maxSpeed); //prints speed of child class
        System.out.println(super.maxSpeed); //prints speed of parent class
        this.display();
        super.display();

    }
}


class  Vehicle{
    public int maxSpeed = 180;


    void display()
    {
        System.out.println("Parent!");
    }

    Vehicle()
    {
        System.out.println("DC - Vehicle");
    }
    Vehicle(int a) {
        System.out.println("PC - Vehicle");
    }

    void message()
    {
        System.out.println("Hello Vehicle");
    }
}
