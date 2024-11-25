package Nov.Recordings;

public class TClass {

    public static void main(String[] args)
    {
        Test<Integer> i = new Test<Integer>(5);
        System.out.println(i.getObject());

        Test<Double> i2 = new Test<Double>(67.9);
        System.out.println(i2.getObject());
    }
}

class Test <T>
{
    T obj;
    Test(T obj)
    {
        this.obj = obj;
    }

    public T getObject()
    {
        return this.obj;
    }
}