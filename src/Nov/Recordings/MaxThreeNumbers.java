package Nov.Recordings;

public class MaxThreeNumbers {
    public static void main(String[] args) {
            int maxInput = maxNumbers(45,90, 78);
        System.out.println(maxInput);
    }

    public static int maxNumbers(int a, int b, int c)
    {
        int max = a;

        if(b > max)
        {
            max = b;

        }
        if(c > max)
        {
            max = c;
        }

        return max;
    }
}
