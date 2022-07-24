import org.junit.Assert;
import org.junit.Test;

public class BankAccountTesting {

    @Test
    public void methodToSeeWithdrawalShrinkBalance(){
        AccauntDeatils accauntDeatils = new AccauntDeatils();
        accauntDeatils.setBalance(100);
        long expectedResuls = accauntDeatils.getBalance();
        Assert.assertEquals(expectedResuls, accauntDeatils.getBalance());


    }
}
