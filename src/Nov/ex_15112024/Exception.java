package Nov.ex_15112024;

public class Exception {
    public static void main(String[] args) {
        String ip = args[0];

        int a = Integer.parseInt(ip);
        int b = 1000/a;
        System.out.println(b);
        System.out.println("End of Program!");

    }
}
