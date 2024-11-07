package Oct.ex_30102024;

public class Arrays_Exception {
    public static void main(String[] args) {
        //Invalid - NegativeArraySizeException
//    int[] a = new int[-1];
//    System.out.println(a);


        //Values of array can be negative
        int[] a2 = {-1, -2, -3};
        int[] a4 = new int[3];
        a4[0] = -90;
        a4[1] = 12;
        a4[2] = -33;

        for(int i=0; i<3; i++)
        {
            System.out.println(a4[i]);
        }

        System.out.println("Printing using for each loop:");
        for(int i: a4)
        {
            System.out.println(i);
        }

        String names[] = {"pramod", "Shivanya", "Rohit", "mrunal", "Akanksha"};

        for(String name:names)
        {
            System.out.println(name);
        }

    }





}
