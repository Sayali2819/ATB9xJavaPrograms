package Nov.ex_19112024;

public class Generic_Example {
    public static void main(String[] args)
    {
        System.out.println("Hello!");
        System.out.println(temp_sum(23,67));
        System.out.println(temp_sum("Siya", " Shetty"));
        temp_Sum("Maya", 90);
        temp_Sum(true,  false);
    }

    public static Integer temp_sum(Integer a, Integer b)
    {
        return  a+b;
    }

    public static String temp_sum(String  a, String  b)
    {
        return  a+b;
    }

    //Generic Function
    public static <T> T temp_Sum(T a, T b)
    {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
