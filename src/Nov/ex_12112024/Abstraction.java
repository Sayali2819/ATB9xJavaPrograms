package Nov.ex_12112024;

public class Abstraction {

}

class  Pramod extends  Loan
{

    @Override
    void loan50k()
    {
        System.out.println("Giving the loan!");
    }
}

abstract class Loan{
    abstract  void loan50k();

    void loan1L()
    {
        System.out.println("1L loan is there");
    }
}

class  Person{}
class  Student1{}
class Student2{}
class  Student3{}

