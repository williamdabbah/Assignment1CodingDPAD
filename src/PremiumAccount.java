public class PremiumAccount implements IAccount {

    //State
    int accountNumber;
    double balance;

    //Constructor
    public PremiumAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    //Behaviour
    @Override
    public void Deposit(double amount) {
        balance += amount;
    }

    @Override
    public double Withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return amount;
        } else {
            return 0;
        }
    }
    @Override
    public double GetCurrentBalance() {
        return balance;
    }

    @Override
    public int GetAccountNumber() {
        return accountNumber;
    }
}
