package Nov.ex_11112024.Real;

public class TestCase extends BaseClass{

    public TestCase()
    {
        super(); //Calls parent constructor
        System.out.println("DC - testcase1!");

    }

    public void startTestCase()
    {
        openBrowser("Chrome");
        closeBrowser();
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {

        System.out.println("Own Logic!");
        super.setBrowser(browser, isAuth);
    }
}
