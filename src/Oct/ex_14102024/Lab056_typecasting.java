package Oct.ex_14102024;

public class Lab056_typecasting {
    public static void main(String[] args) {
        //TypeCasting - converting a variable from one data type to another.
        //Widening - implicit, explicit - lossless
        //Narrowing - implicit, explicit (with data type) , loss

        byte b = 10;
        int a = b;   //-> implicit casting

        //String c = b;   //Won't happen as they are not compatible

        int a1 = (int)b;

        int b1 = 200;
//        byte c = b1;  //invalid

        long phone_no = 8923411234l;
        short s = (short) phone_no;
        System.out.print(s);

    }
}
