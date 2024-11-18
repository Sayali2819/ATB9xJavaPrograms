package Nov.ex_18112024;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_Example {
    public static void main(String[] args) throws FileNotFoundException, Exception {

        //Throws - Checked
        FileInputStream fileInputStream = new FileInputStream(new File("C://abc.txt"));

    }
}
