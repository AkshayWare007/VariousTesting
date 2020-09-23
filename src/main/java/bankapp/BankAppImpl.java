package bankapp;


import com.db.acm.models.Account;
import com.db.acm.models.AccountActionException;
import com.db.acm.models.AccountResponse;
import com.db.acm.services.AccountManagement;

public class BankAppImpl implements BankApp {

    private AccountManagement accountManagement;

    public void setAccountManagement(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    public String createBankAccount(AccountDetails details) throws BankException {
        AccountResponse response = null;
        try {
            Account account = new Account();
            account.setAccountHolderName(details.getAccountName());
            account.setOpeningBalance(100);
            response = this.accountManagement.createAccount(account);
        }catch (AccountActionException e){
            throw new BankException();
        }
        return response.getStatusMessage();
    }
}
