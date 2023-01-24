public class BasicAccount implements IAccount {

    //State
    int accountNumber;
    double withdrawalLimit;
    double balance;

    //Constructor
    public BasicAccount(int accountNumber, double withdrawalLimit){
        this.accountNumber = accountNumber;
        this.withdrawalLimit = withdrawalLimit;
        this.balance = 0;
    }

    //Behaviour
    @Override
    public void Deposit(double amount) {
        balance += amount;
    }

    @Override
    public double Withdraw(double amount) {
        if (amount <=withdrawalLimit) {
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
