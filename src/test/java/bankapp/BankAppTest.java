package bankapp;

import com.db.acm.models.Account;
import com.db.acm.models.AccountResponse;
import com.db.acm.services.AccountManagement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BankAppTest {

    // In which class to inject mock
    @InjectMocks
    BankAppImpl app = new BankAppImpl();


    //what is to mock
    @Mock
    AccountManagement accountManagement;

    @Test
    public void testCreateBankAccount() throws Exception{

        /** Behaviour **/
        System.out.println(accountManagement.getClass().getName());
        Account account = new Account();
        account.setAccountHolderName("Akshay");
        AccountResponse response = new AccountResponse();
        response.setStatusMessage("CREATED");
        response.setStatus("SUCESS");
        when(accountManagement.createAccount(account)).thenReturn(response);
        System.out.println(accountManagement.createAccount(account).getStatus());
        app.setAccountManagement(accountManagement);

        /** Testing */
        AccountDetails details = new AccountDetails();
        String actualResponse = app.createBankAccount(details);
        String expected = "SUCCESS";
        assertEquals(actualResponse, expected);
        /*AccountDetails details = new AccountDetails();
        details.setAccountName("Akshay");
        details.setAccountType("SAVING");

        Account acc = new Account();
        acc.setAccountHolderName(details.getAccountName());
        acc.setAccountDescription(details.getAccountType());

        AccountResponse response = new AccountResponse();
        response.setAccountid(new Random().nextLong() + "");
        response.setStatus("SUCCESS");
        response.setStatusMessage("ACCOUNT_CREATED");
        when(accountManagement.createAccount(acc)).thenReturn(response);

        System.out.println(accountManagement.createAccount(acc).getStatusMessage());*/
        /*String actualResult = app.createBankAccount(details);
        String expected = "SUCCESS";
        assertEquals(actualResult, expected);*/
    }

}