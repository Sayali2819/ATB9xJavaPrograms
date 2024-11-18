package Nov.ex_18112024;

public class Example_Second {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;

        try
        {
            c = 10/a;
            String s1 = null;
            s1.trim();
        }
        catch (ArithmeticException | NullPointerException e )
        {
            System.out.println(e.getMessage());
        }

        System.out.println(c);
    }
}
