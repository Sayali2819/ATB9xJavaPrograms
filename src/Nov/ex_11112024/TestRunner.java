package Nov.ex_11112024;

import Nov.ex_11112024.Real.BaseClass;
import Nov.ex_11112024.Real.TestCase;

public class TestRunner {
    public static void main(String[] args) {
        TestCase tc1 = new TestCase();
        tc1.setBrowser("chrome", true);
        System.out.println(tc1.getBrowser());
        //tc1.openBrowser(); //Unable to access as it is not public
        tc1.startTestCase();

    }
}
