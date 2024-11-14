package Nov.ex_14112024_Static_Wrapper;

public class Static {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        System.out.println(s.age);
        System.out.println(Student.school_Name);
        Student.school_Name = "Xavier's High School";
        System.out.println(Student.school_Name);
        System.out.println(s.school_Name);
        System.out.println(s1.school_Name);
    }
}

class Student{
    int age = 12;       //Non static or instance variable
    static String school_Name = "ABC";

    {
        System.out.println("I am IIB");
        System.out.println("Executed whenever object is created!");
        System.out.println("-------------------------------------------------------");
    }



    static
    {
        System.out.println("I am SIB");
        System.out.println("Loaded once, when class is Loaded.");
        System.out.println("Read the excel file!");
        System.out.println("------------------------------------------------------");
    }
}