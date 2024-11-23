package Nov.ex_21112024;

import java.util.ArrayList;
import java.util.List;

public class Student_RunnerClass {
    public static void main(String[] args) {
        Student s = new Student("Neeraj", 12);
        Student s1 = new Student("Riya", 14);
        Student s2 = new Student("Sonam", 19);

        List<Student> myStd = new ArrayList<>();
        myStd.add(s);
        myStd.add(s1);
        myStd.add(s2);

       s.printDetails();
       s1.printDetails();
       s2.printDetails();
    }
}
