package Nov.ex_12112024;

public class Interface {

}

abstract class A
{
    abstract void m1();

    public A() {
    }

    void m2()
    {
        System.out.println("Complete Method!");
    }
}


interface I
{
    void m1();
    void m2();

    default void m4()
    {
        System.out.println("Default Method");
    }

    default void m5()
    {
        System.out.println("Default Method");
    }

    static void m6()
    {
        System.out.println("Static method in Interface");
    }
}