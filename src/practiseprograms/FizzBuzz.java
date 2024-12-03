package practiseprograms;

public class FizzBuzz {
    public static void main(String[] args) {

        for(int i = 1; i<=100; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FIZZBUZZ3&5");
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz3");
            }
            else if(i % 5 == 0 )
            {
                System.out.println("Buzz5");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
