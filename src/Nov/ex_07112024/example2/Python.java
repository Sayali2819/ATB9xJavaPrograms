package Nov.ex_07112024.example2;

public class Python extends  Programming{

    void print()
    {
        System.out.println(author);
        System.out.println(version);

    }

    public static void main(String[] args) {
        Python p1 = new Python();
        System.out.println(p1.author);
        System.out.println(p1.version);
        p1.print();
    }

}
