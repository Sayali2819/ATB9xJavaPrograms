package Nov.ex_12112024;

public class Lab158 {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan50k();
        c.loan25k();
    }
}

class Child extends  Father{

    @Override
    void loan50k() {
        System.out.println("Child is giving the 50k loan");
    }
}

abstract class  Father{
    abstract  void loan50k();

    void loan25k()
    {
        System.out.println("Done by Father");
    }
}