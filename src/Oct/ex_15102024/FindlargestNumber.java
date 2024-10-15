package Oct.ex_15102024;

public class FindlargestNumber {
    public static void main(String[] args) {
        int a = 12;
        int b = 178;
        int c = 99;

        int largestNumber = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The largest number is " +largestNumber);
    }
}
