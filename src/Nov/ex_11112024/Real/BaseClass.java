package Nov.ex_11112024.Real;

public class BaseClass {

    private String browser;

    BaseClass()
    {
        System.out.println("Default Constructor! - BaseClass");
    }

     BaseClass(String browser) {
        this.browser = browser;
    }


    public String getBrowser() {
        return browser;
    }



    public void setBrowser(String browser, boolean isAuth) {
        if(isAuth)
        {
            this.browser = browser;
        }
        else
        {
            System.out.println("Not Allowed!");
        }

    }

    void  openBrowser()
    {
        System.out.println("Opening browser!");
    }

    void  closeBrowser()
    {
        System.out.print("Close Browser!");
    }

    void openBrowser(String browser)
    {
        System.out.println("Open Browser: "+browser);
    }

}
