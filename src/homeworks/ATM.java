package homeworks;

public class ATM {
    private int balance;
    private int twentyCount;
    private int twenty = 20;
    private int fiftyCount;
    private int fifty = 50;
    private int hundredCount;
    private int hundred = 100;

    public ATM(int twentyCount, int fiftyCount, int hundredCount) {
        this.twentyCount = twentyCount;
        this.fiftyCount = fiftyCount;
        this.hundredCount = hundredCount;
        this.balance = ((twentyCount * twenty) + (fiftyCount * fifty) + (hundredCount * hundred));
    }

    private void calculateBalance() {
        this.balance = ((this.twentyCount * this.twenty) + (this.fiftyCount * this.fifty)
                + (this.hundredCount * this.hundred));
    }

    public void topUpATMbalance(int twentyCount, int fiftyCount, int hundredCount) {
        this.twentyCount = twentyCount;
        this.fiftyCount = fiftyCount;
        this.hundredCount = hundredCount;
        calculateBalance();
    }

    public boolean withdrowalMoney(int withdrowalAmount) {
        int twentyCountToWithdrowal = 0;
        int fiftyCountToWithdrowal = 0;
        int hundredCountToWithdrowal = 0;
        int remainedAmount = withdrowalAmount;

        if (withdrowalAmount > balance) {
            System.out.println("Not enought ATM balance!" + "\n\t");
            return false;
        }

        if (remainedAmount / hundred <= hundredCount) {
            hundredCountToWithdrowal += remainedAmount / hundred;
            remainedAmount %= hundred;
        }

        if (remainedAmount / fifty <= fifty) {
            fiftyCountToWithdrowal += remainedAmount / fifty;
            remainedAmount %= fifty;
        }

        if (remainedAmount <= twenty) {
            twentyCountToWithdrowal += remainedAmount / twenty;
            remainedAmount %= twenty;
        }

        if (remainedAmount != 0) {
            System.out.println("Some fatal error in calcaulation!!!! - " + remainedAmount);
            return false;
        }

        this.twentyCount -= twentyCountToWithdrowal;
        this.fiftyCount -= fiftyCountToWithdrowal;
        this.hundredCount -= hundredCountToWithdrowal;
        calculateBalance();

        System.out.println("You requested a withdrawal of " + withdrowalAmount + ". Amount issued in banknotes:" + //
                "\n20 : " + twentyCountToWithdrowal +
                "\n50 : " + fiftyCountToWithdrowal +
                "\n100 : " + hundredCountToWithdrowal + "\n\t");

        return true;
    }

    @Override
    public String toString() {
        return "The balance is " + balance +
                "\nThe count of 20 banknotes is " + twentyCount +
                "\nThe count of 50 banknotes is " + fiftyCount +
                "\nThe count of 100 banknotes is " + hundredCount + "\n\t";
    }
}
