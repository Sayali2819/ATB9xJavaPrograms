package Nov.ex_12112024;

public class Interface_Ex3 {


}

class Child1 implements father, Mother
{

    @Override
    public void f3() {
        System.out.println("Function f3!");
    }

    @Override
    public void f4() {
        System.out.println("Function f4!");
    }

    @Override
    public void f1() {
        System.out.println("Function f1!");
    }

    @Override
    public void f2() {
        System.out.println("Function f2!");
    }

    @Override
    public void same() {
        System.out.println("Same Function!");
    }
}


interface  father
{
    void f1();
    void f2();
    void same();
}


interface  Mother
{
    void f3();
    void f4();
    void same();
}