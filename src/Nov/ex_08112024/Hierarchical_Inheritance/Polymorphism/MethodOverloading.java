package Nov.ex_08112024.Hierarchical_Inheritance.Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
//        float result = m.add(78.34f,8.9f);
//        System.out.println(result);
        m.add(2, 5, 90);




    }
}

class MathOperations
{
    //Method Overloading
    int add(int a, int b)
    {
        return  a+b;
    }

    float add(float a, float b)
    {
        return a+b;
    }

    void add(int a, int b, int c)
    {
        System.out.println("Hello!");
    }
}