package Nov.ex_07112024.example3;

public class TestCase extends BaseTest{

    public TestCase() {
        System.out.println("DC - Child!");
    }

    void testcase()
    {
        startBrowser();
        readExcelFile();
        closeBrowser();
    }


}


