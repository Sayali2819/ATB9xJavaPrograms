package Nov.ex_14112024_Static_Wrapper;

public class Static_IIB_SIB {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
    }
}

class A
{
    {
        System.out.println("IIB");
    }

    static
    {
        System.out.println("SIB");
    }
}