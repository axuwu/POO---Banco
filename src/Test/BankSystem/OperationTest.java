package BankSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Operation Test
 */
class OperationTest {

    /**
     * Test initBalance()
     */
    @Test
    void initBalance() {
        Operation o = new Operation();
        o.initBalance(25.00);
        assertEquals(25.00, o.balance);
    }

    /**
     * Test deposit()
     */
    @Test
    void deposit() {
        Operation o = new Operation();
        o.deposit(25.00);
        assertEquals(24.58, o.balance);
    }

    /**
     * Test withdraw()
     */
    @Test
    void withdraw() {
        Operation o = new Operation();
        o.initBalance(1.00);
        o.withdraw(1.00);
        assertEquals(-0.42, o.balance);
    }

    /**
     * Test balance()
     */
    @Test
    void balance() {
        Operation o = new Operation();
        o.initBalance(25.00);
        assertEquals(25.00, o.balance());
    }
}