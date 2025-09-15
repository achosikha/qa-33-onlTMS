package homeworks;

public class CreditCard {
    private double balance;
    private int accountNumber;

    public CreditCard(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void topUpMoney(double money) {
        this.balance += money;
        System.out.println("The balance increased on " + money);
    }

    public void withdrowalMoney(double money) {
        this.balance -= money;
        System.out.println("The balance decreased on " + money);
    }

    @Override
    public String toString() {
        return "The balance of your card " + accountNumber
                + " is " + balance;
    }
}