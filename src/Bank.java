public class Bank implements IBank {


    //State

    //Constructor
    public Bank() {
    }

    //Behaviour
    @Override
    public void OpenAccount(IAccount account) {
        accounts.add(account);

    }

    @Override
    public void CloseAccount(int accountNumber) {
        for (IAccount account : accounts) {
            if (account.GetAccountNumber() == accountNumber) {
                if (account.GetCurrentBalance() > 0)
            }
            accounts.remove(account);
        }else{
            System.out.println("Account is not closed due to debt!");
        }
        break;

    }
}

    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return accounts;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt(){
        for(IAccount account:accounts){
        if(account.GetCurrentBalance()<0){
        inDebtAccounts.add(account);
        }
        }
        return inDebtAccounts;

        }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
    for (IAccount account: accounts) {
        if (account.GetCurrentBalance()> balanceAbove){
            accountsWithBalance.add(account);
        }
    }
    return accountsWithBalance;
            }
        }

