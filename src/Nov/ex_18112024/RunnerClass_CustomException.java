package Nov.ex_18112024;

public class RunnerClass_CustomException {
    public static void main(String[] args) throws Exception {

        Bank sbi = new Bank("INR", 100);
        Bank icici = new Bank("INR", 123);
        System.out.println(sbi.add(icici));

        Bank jp_chase = new Bank("USD", 100);
        //100 + 100 * 85 = 8600;
        System.out.println(sbi.add(jp_chase));
    }
}
