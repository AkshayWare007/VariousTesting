package bankapp;

public interface BankApp{
    String createBankAccount(AccountDetails details) throws BankException;
}
