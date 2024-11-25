package Nov.Recordings;

public class MaxNumberUsingGenerics {

    public  static  <DT extends Comparable<DT>> DT maxNum(DT a, DT b, DT c)
    {
        DT max = a;
        if(b.compareTo(max) > 0)
        {
            max = b;
        }
        if(c.compareTo(max) > 0)
        {
            max = c;
        }

        return  max;
    }

    public static void main(String[] args)
    {
        System.out.println(maxNum("Divya","Moksha","Aditi"));
        System.out.println(maxNum(45,22,90));
        System.out.println(maxNum(23.90, 10.56, 15.90));
    }
}
