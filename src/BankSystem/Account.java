package BankSystem;
/**
 * Class that represents the account
 */
public class Account {
    private int number;
    private Client client;

    /**
     * The account construction
     * @param number account number of the client
     * @param client the client itself
     */
    public Account(int number, Client client){
        this.number = number;
        this.client = client;
    };

    /**
     * Gets the account number
     * @return int account number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the client name
     * @param newName the new name
     */
    public void setClientName(String newName){
        client.setName(newName);
    }

    /**
     * Sets the client birthdate
     * @param newBirthdate the new birthdate
     */
    public void setClientBirthdate(String newBirthdate){
        client.setBirthdate(newBirthdate);
    }

    /**
     * Sets the client address
     * @param newAddress the new address
     */
    public void setClientAddress(String newAddress){
        client.setAddress(newAddress);
    }

    /**
     * Sets the client email
     * @param newEmail the new email
     */
    public void setClientEmail(String newEmail) {
        client.setEmail(newEmail);
    }

    /**
     * Sets the client phone number
     * @param newPhone the new phone
     */
    public void setClientPhone(int newPhone){
        client.setPhone(newPhone);
    }

    /**
     * Gets the client
     * @return client
     */
    public Client getClient(){
        return client;
    }

    /**
     * Sets the client
     * @param client the new Client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Returns with account number + client info
     * @return
     */
    public String toString() {
        return "Account number: " +
                number +
                "Account Holder: "+
                client.getName();
    }
}
