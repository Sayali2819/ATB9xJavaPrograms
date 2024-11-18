package Nov.ex_15112024;

public class Conversion {
    public static void main(String[] args) {
        String num = "10";
        //String -> Wrapper(Integer) -> Primitive
        Integer a = Integer.valueOf(num);
        int a2 = a;


        //String to Primitive
        int a3 = Integer.parseInt(num);

        //Wrapper class
        Long l = 10l;
        Short s = 23;
        Boolean b = true;
    }
}
