package org.example;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    @Test
    public void CreateAccount() {
        Bank bank = new Bank();
        Customer customer = new Customer("Mete");
        Account account = bank.createAccount("Mete", 1000);

        assertNotNull(account);
        assertEquals(customer, account.getCustomer());

    }

    @Test
    public  void retrieveAccount(){
        Bank bank = new Bank();
        Customer customer = new Customer("Mete");
        bank.createAccount("Mete",2000);
        assertEquals(1000, bank.retrieveAccount(customer).getBalance());
    }
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return (Test) new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
