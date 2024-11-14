package Nov.ex_14112024_Static_Wrapper;

public class Real_SIB_IIB {
    public static void main(String[] args) {
        ATB b = new ATB("Aaryan");
        ATB b1 = new ATB("Mayra");
        ATB b2 = new ATB("Kinnari");
        System.out.println("Course Name:" + ATB.courseName);
        b.readDocuments();
        ATB.doAssignment();

    }
}


class  ATB {
    {
        System.out.println("IIB");
        System.out.println("Reading from CSV file");
    }

    public ATB(String name) {
        this.name = name;
    }

    static {
        System.out.println("Load the clas?, I will execute");
    }

    private String name;
    private String phone;
    static String courseName = "ATB9x";


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //Non static method can access static variable
    void readDocuments()
    {
        System.out.println("Non static method");
        System.out.println(courseName);
    }

    //Static method can not access non static variable as static method will be executed during
    //class loading and that time non static variable are present
    static void doAssignment()
    {
        System.out.println("Do Assignment!");
        //System.out.println(phone); --> Invalid
    }

}