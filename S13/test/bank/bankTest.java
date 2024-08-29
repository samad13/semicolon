package bank;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class bankTest {


    @Test
    public void count_number_of_account() {
        var bank = new Bank();
        bank.createAccountFor("samad", "dayo", "pin");
        assertEquals(1, bank.countAccounts());

    }

    @Test
    public void deposit_money() {
        var bank = new Bank();
        bank.createAccountFor("samad", "dayo", "pin");
        bank.depositFor(1, 3000);
        assertEquals(3000, bank.checkBalance(1));

    }

    @Test
    public void withdraw_money() {
        var bank = new Bank();
        bank.createAccountFor("samad", "dayo", "pin");
        bank.depositFor(1, 5000);
        assertEquals(5000, bank.checkBalance(1));
        bank.withdrawFor(1, 3000,"pin");
        assertEquals(2000, bank.checkBalance(1));

    }

    @Test
    public void transfer_money_from_one_account_to_another_account() {
        var bank = new Bank();
        bank.createAccountFor("samad", "dayo", "pin");
        bank.depositFor(1, 5000);
        bank.createAccountFor("david", "jones", "pin");
        bank.transferFor(1,  2000,2, "pin");
        assertEquals(2, bank.countAccounts());
        assertEquals(3000, bank.checkBalance(1));
        assertEquals(2000, bank.checkBalance(2));

    }



    @Test
    public void close_user_account() {
        var bank = new Bank();
        bank.createAccountFor("samad", "dayo", "pin");
        assertEquals(1, bank.countAccounts());
        bank.createAccountFor("amad", "dayo", "pin");
        assertEquals(2, bank.countAccounts());
        bank.userAccountNumber(1, "pin");
        assertEquals(1, bank.countAccounts());


    }












}
