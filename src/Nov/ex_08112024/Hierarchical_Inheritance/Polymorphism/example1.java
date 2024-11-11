package Nov.ex_08112024.Hierarchical_Inheritance.Polymorphism;

public class example1 {
    public static void main(String[] args) {
        Son s = new Son();
        s.home();

        Father f = new Father();
        f.home();

        Father f1 = new Son();
        f1.home();  //It will execute home method present in son class
    }
}

class  Father
{
    void home()
    {
        System.out.println("2BHK!");
    }

    void f2()
    {

    }
}

class Son extends Father
{
    @Override
    void home()
    {
        System.out.println("3BHK!");
    }

    void f1()
    {

    }
}