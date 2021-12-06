package BankSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Account Test
 */
class AccountTest {

    /**
     * Test getNumber()
     */
    @Test
    void getNumber() {
        Client c = new Client("Xu", 1, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Account acc = new Account(15, c);
        assertEquals(15, acc.getNumber());
    }

    /**
     * Test setClientName()
     */
    @Test
    void setClientName() {
        Client c = new Client("Xu", 1, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Account acc = new Account(15, c);
        acc.setClientName("Eu");
        assertEquals("Eu", c.getName());
    }

    /**
     * Test setClientBirthdate()
     */
    @Test
    void setClientBirthdate() {
        Client c = new Client("Xu", 1, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Account acc = new Account(15, c);
        acc.setClientBirthdate("1/12/1997");
        assertEquals("1/12/1997", c.getBirthdate());
    }

    /**
     * Test setClientAddress()
     */
    @Test
    void setClientAddress() {
        Client c = new Client("Xu", 1, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Account acc = new Account(15, c);
        acc.setClientAddress("Rua");
        assertEquals("Rua", c.getAddress());
    }

    /**
     * Test setClientEmail()
     */
    @Test
    void setClientEmail() {
        Client c = new Client("Xu", 1, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Account acc = new Account(15, c);
        acc.setClientEmail("x@email.pt");
        assertEquals("x@email.pt", c.getEmail());
    }

    /**
     * Test setClientPhone()
     */
    @Test
    void setClientPhone() {
        Client c = new Client("Xu", 1, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Account acc = new Account(15, c);
        acc.setClientPhone(912345678);
        assertEquals(912345678, c.getPhone());
    }

    /**
     * Test getClient()
     */
    @Test
    void getClient(){
        Client c = new Client("Xu", 1, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Account acc = new Account(15, c);
        assertEquals(c, acc.getClient());
    }

    /**
     * Test setClient()
     */
    @Test
    void setClient() {
        Client c = new Client("Xu", 1, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Account acc = new Account(15, c);
        Client client = new Client("Eu", 2, "24/5/1998", "Rua Ecam", "xu@email.com", 912345678);
        acc.setClient(client);
        assertEquals(client, acc.getClient());
    }

    /**
     * Tes toString()
     */
    @Test
    void testToString() {
        Client c = new Client("Xu", 1, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Account acc = new Account(15, c);
        String str =
                "Account number: " +
                acc.getNumber() +
                "Account Holder: "+
                acc.getClient().getName();
        assertEquals(str, acc.toString());
    }
}