package Nov.ex_08112024.Hierarchical_Inheritance.Encapsulation;

public class Encap {
    public static void main(String[] args) {
        VWOLogin login = new VWOLogin("admin", "password123");
        System.out.println(login.password);
        login.password = "hacker";
        System.out.println(login.password);


        GoodVwoLogin l = new GoodVwoLogin("admin", "password123");
//        System.out.println(login2.password); //Giving error as it is encapsulated/hidden which can be accessed by methods
//       System.out.println(l.giveMePassword(false));

    }
}

class VWOLogin
{
    public String username;
    public  String password;

    public VWOLogin(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
}

class GoodVwoLogin
{
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public GoodVwoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

//    public String giveMePassword(Boolean isAuth)
//    {
//        if(isAuth)
//        {
//            return password;
//        }
//        return "None";
//    }
}

