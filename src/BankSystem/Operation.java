package BankSystem;
/**
 * Class that represent the balance movement
 */
public class Operation {
    double balance;

    /**
     * Construction of the operation setting up the balance with 0,00
     */
    public Operation(){
        balance = 0;
    }

    /**
     * Sets the initial balance
     * @param amount initial balance
     */
    public void initBalance(double amount){ balance = amount; }

    /**
     * Does the deposit of the monew with 0.42 of tax
     * @param amount to deposit
     */
    public void deposit(double amount){
        balance = balance + amount - 00.42;
    }

    /**
     * Does the withdraw of the monew with 0.42 of tax
     * @param amount to withdraw
     */
    public void withdraw(double amount){ balance = balance - amount - 00.42; }

    /**
     * Gets the balance
     * @return balance
     */
    public double balance(){
        return balance;
    }

}
