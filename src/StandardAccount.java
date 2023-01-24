public class StandardAccount implements IAccount {

    //State
    int accountNumber;
    double creditLimit;
    double balance;


    //Constructor
    public StandardAccount(int accountNumber, double creditLimit)
    {
        this.accountNumber = accountNumber;
        if(creditLimit>0) creditLimit =0;
        this.creditLimit = creditLimit;
        this.balance = 0.0;
    }

    //Behaviour
    @Override
    public void Deposit(double amount) {
        balance += amount;
    }

    @Override
    public double Withdraw(double amount) {
        if (amount > (balance + creditLimit)) {
            amount = balance + creditLimit;
        }
        balance -= amount;
        return amount;
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
