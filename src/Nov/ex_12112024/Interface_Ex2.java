package Nov.ex_12112024;

public class Interface_Ex2 {
    public static void main(String[] args) {
        P p = new P();
        p.f1();
        p.f3();
        p.f2();
    }
}

class P implements I1{

    @Override
    public void f1() {
        System.out.println("Function f1!");
    }

    @Override
    public void f2() {
        System.out.println("Function f2!");
    }

    @Override
    public void f3() {
        System.out.println("Function f3!");
    }
}

interface I1
{
    void f1();
    void f2();
    void f3();
}
