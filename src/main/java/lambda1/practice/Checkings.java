package lambda1.practice;

public class Checkings extends Account{
    String checkingsBalance;

    public String getCheckingsBalance() {
        return checkingsBalance;
    }

    public Checkings(String checkingsBalance) {
        this.checkingsBalance = checkingsBalance;
    }

    public void setCheckingsBalance(String checkingsBalance) {
        this.checkingsBalance = checkingsBalance;
    }
}
