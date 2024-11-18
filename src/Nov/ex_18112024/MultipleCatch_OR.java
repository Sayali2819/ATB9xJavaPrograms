package Nov.ex_18112024;

public class MultipleCatch_OR {
    public static void main(String[] args) {
        try
        {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100 / a;
            System.out.println(b);
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
