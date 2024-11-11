package Nov.ex_08112024.Hierarchical_Inheritance.Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Hound h = new Hound();
        h.bark();
    }

}


class  Dog
{
    void bark()
    {
        System.out.println("I am Dog, i will Bark!!");
    }

    int age = 10;
}

class  Hound extends  Dog
{
    @Override
    void bark()
    {
        System.out.println("Bark of Hound!");
    }
}