package Nov.ex_18112024;

public class Multiple_Try {
    public static void main(String[] args) {

        String ip = null;

        try
        {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }

        int a = 0;
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        int b = 0;
        try {
            b = 1000/a;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }

        System.out.println("End of the program!");
    }
}
