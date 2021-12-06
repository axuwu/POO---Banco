package BankSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Bank Test
 */
class BankTest {

    /**
     * Test setAccount()
     */
    @Test
    void setAccount() {
        Client xu = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Bank bank = new Bank(xu, 100);
        assertEquals(100, bank.getAssociatedNumber());
    }

    /**
     * Test getAssociatedNumber()
     */
    @Test
    void getAssociatedNumber() {
        Client client = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Bank bank = new Bank(client, 100);
        assertEquals(100, bank.getAssociatedNumber());
    }

    /**
     * Test update()
     */
    @Test
    void update() {
        Client client = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Bank bank = new Bank(client, 100, 15.00);
        assertEquals(15.00, bank.getBalance());
    }

    /**
     * Test doDeposit()
     */
    @Test
    void doDeposit() {
        Client client = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Bank bank = new Bank(client, 100);
        bank.doDeposit(1.42);
        assertEquals(1, bank.getBalance());
    }

    /**
     * Test doWithdraw()
     */
    @Test
    void doWithdraw() {
        Client client = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Bank bank = new Bank(client, 100, 2.42);
        bank.doWithdraw(1.00);
        assertEquals(1, bank.getBalance());
    }

    /**
     * Test doTransfer()
     */
    @Test
    void doTransfer() {
        Client client1 = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Bank bank1 = new Bank(client1, 100);
        Client client2 = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Bank bank2 = new Bank(client2, 150, 100.42);
        bank2.doTransfer(bank1, 50);

        assertEquals(50 ,bank2.getBalance());
        assertEquals(49.58, bank1.getBalance());
    }

    /**
     * Test getBalance()
     */
    @Test
    void getBalance() {
        Client client = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Bank bank = new Bank(client, 100, 100);
        assertEquals(100, bank.getBalance());
    }

    /**
     * Test toString()
     */
    @Test
    void testToString() {
        Client client = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Bank bank = new Bank(client, 100, 100);
        double d = bank.getBalance();
        String stringBalance = String.valueOf(d);
        String str = new String(
                "Bank{" +
                "\n" +
                "Bank Account Number: " + bank.getAssociatedNumber() +
                "\n" +
                "Client: " + client.toString() +
                "\n" +
                "Balance: " + stringBalance +
                "\n" +
                "}");

        assertEquals(str, bank.toString());
    }
}