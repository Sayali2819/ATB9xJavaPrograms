package Nov.ex_18112024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Unchecked_Checked_Example {
    public static void main(String[] args) {

        //Unchecked
        try
        {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Unchecked!");
        }


        //Checked
        try
        {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally Checked Exception!");
        }
    }
}
