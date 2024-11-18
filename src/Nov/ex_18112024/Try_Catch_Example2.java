package Nov.ex_18112024;

public class Try_Catch_Example2 {
    public static void main(String[] args) {

        final  double pi = 3.14;
        int a = 0;

        try
        {
            int x = 10 / a;
        } catch (Exception e) {
            System.out.println("Div by zero");
        }
        finally {
            System.out.println("I will be executed anyhow!");
        }
    }
}
