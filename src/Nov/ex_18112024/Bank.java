package Nov.ex_18112024;

public class Bank {

    private String currecy;
    private Integer amount;

    public Bank(String currecy, Integer amount) {
        this.currecy = currecy;
        this.amount = amount;
    }

    public String getCurrecy() {
        return currecy;
    }

    public void setCurrecy(String currecy) {
        this.currecy = currecy;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws Exception {
        if(!bankName.currecy.equalsIgnoreCase("INR"))
        {
            throw new Exception("Currency Mismatch, Can't Proceed!");
        }
        return bankName.amount + this.amount;
    }
}
