package BankSystem;
/**
 * Class that represents a banking system that setups a client with bank account + letting do operations
 */
public class Bank extends Operation{
    private int associatedNumber;
    private Client client;
    private Account account;
    private double balance;

    /**
     * Construction of baking system of client
     * @param client client that wants banking system
     * @param associatedNumber number of the account
     */
    public Bank(Client client, int associatedNumber){
        this.client = client;
        this.associatedNumber = associatedNumber;
        this.account=setAccount();
        this.balance=0;
        update();
    }

    /**
     * Construction of baking system of client with initial balance
     * @param client client that wants banking system
     * @param numDedicated number of the account
     * @param initialBalance initial balance of their bank account
     */
    public Bank(Client client, int numDedicated, double initialBalance){
        this.client = client;
        this.associatedNumber = numDedicated;
        this.account=setAccount();
        initBalance(initialBalance);
        this.balance=initialBalance;
        update();
    }

    /**
     * Sets the account for the client with using the associatedNumber as the account number
     * @return the account
     */
    public Account setAccount(){
        Account x = new Account(associatedNumber, client);
        return x;
    }

    /**
     * Gets the account number associated with the client
     * @return account number
     */
    public int getAssociatedNumber(){
        return associatedNumber;
    }

    /**
     * Does the periodic check of the balance (updating it)
     */
    public void update() {
        balance = this.balance();
    }

    /**
     * Does the deposit of specific amount
     * @param amount to deposit
     */
    public void doDeposit(double amount){
        this.deposit(amount);
        update();
    }

    /**
     * Does the withdraw of specific amount
     * @param amount to withdraw
     */
    public void doWithdraw(double amount){
        this.withdraw(amount);
        update();
    }

    /**
     * Does transfer of specific amount to another banking system
     * @param bank the banking system that will receive the money with 0.42 tax
     * @param amount to transfer
     */
    public void doTransfer(Bank bank, double amount){
        this.doWithdraw(amount);
        update();
        bank.doDeposit(amount);

    }

    /**
     * Gets the balance
     * @return balance
     */
    public double getBalance(){
        return balance;
    }

    /**
     * Returns with associated number + client info + balance
     * @return string info
     */
    public String toString() {
        return "Bank{" +
                "\n" +
                "Bank Account Number: " + getAssociatedNumber() +
                "\n" +
                "Client: " + client.toString() +
                "\n" +
                "Balance: " + balance +
                "\n" +
                "}";
    }

    public static void main(String[] args) {
        Client xu = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        Bank bankXu = new Bank(xu, 15615);
        System.out.println(bankXu.getAssociatedNumber());
    }
}
