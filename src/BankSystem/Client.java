package BankSystem;
/**
 * Class that represents the client
 */
public class Client {
    private String name;
    private int id;
    private String birthdate;
    private String address;
    private String email;
    private int phone;

    /**
     * The client construction
     * @param name name
     * @param id id
     * @param birthdate birthdate
     * @param address address
     * @param email email
     * @param phone phone
     */
    public Client(String name, int id, String birthdate, String address, String email, int phone){
        this.name = name;
        this.id= id;
        this.birthdate = birthdate;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    /**
     * Returns a string with all the client info (name, id, birthdate, address, email, phone number)
     * @return string info
     */
    public String toString() {
        return "Name=" + name +
                ", ID=" + id +
                ", Birthdate=" + birthdate +
                ", Address=" + address +
                ", Email=" + email+
                ", Phone Number=" + phone;
    }

    /**
     * Gets the client name
     * @return string name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the client name
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the client id
     * @return int id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the client id
     * @param id the new id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the client birthdate
     * @return string birthdate
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the client birthdate
     * @param birthdate the new birthdate
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Gets the client address
     * @return string address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the client address
     * @param address the new address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the client email
     * @return string email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the client email
     * @param email the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the client phone number
     * @return int phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * Sets the client phone number
     * @param phone the new phone
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public static void main(String[] args) {
        Client c = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        String str = c.toString();
        System.out.println(str);
    }

}
