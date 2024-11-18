package Nov.ex_18112024;

public class Example_Third {
        public static void main(String[] args) {
            int a = 2;
            int c = 0;

            try
            {
                c = 10/a;
                System.out.println(c);
            }
            catch (Exception e )
            {
                System.out.println("Incorrect denominator!");
            }
            finally
            {
                System.out.println("I will be always executed!");
            }


        }
}
