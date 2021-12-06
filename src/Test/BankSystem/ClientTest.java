package BankSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Client Test
 */
class ClientTest {

    /**
     * Test toString()
     */
    @Test
    void testToString() {
        Client c = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        String str =
                "Name=" + c.getName() +
                ", ID=" + c.getId() +
                ", Birthdate=" + c.getBirthdate() +
                ", Address=" + c.getAddress() +
                ", Email=" + c.getEmail()+
                ", Phone Number=" + c.getPhone();
        assertEquals(str, c.toString());
    }

    /**
     * Test getName()
     */
    @Test
    void getName() {
        Client c = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        assertEquals("Xu", c.getName());
    }

    /**
     * Test setName()
     */
    @Test
    void setName() {
        Client c = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        c.setName("Eu");
        assertEquals("Eu", c.getName());
    }

    /**
     * Test getId()
     */
    @Test
    void getId() {
        Client c = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        assertEquals(1234, c.getId());
    }

    /**
     * Test setID()
     */
    @Test
    void setId() {
        Client c = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        c.setId(100);
        assertEquals(100, c.getId());
    }

    /**
     * Test getBirthdate()
     */
    @Test
    void getBirthdate() {
        Client c = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        assertEquals("24/5/1998", c.getBirthdate());
    }

    /**
     * Test setBirthdate()
     */
    @Test
    void setBirthdate() {
        Client c = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        c.setBirthdate("15/3/1996");
        assertEquals("15/3/1996", c.getBirthdate());
    }

    /**
     * Test getAddress()
     */
    @Test
    void getAddress() {
        Client c = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        assertEquals("Rua Teste", c.getAddress());
    }

    /**
     * Test setAddress()
     */
    @Test
    void setAddress() {
        Client c = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        c.setAddress("Rua");
        assertEquals("Rua", c.getAddress());
    }

    /**
     * Test getEmail()
     */
    @Test
    void getEmail() {
        Client c = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        assertEquals("xu@email.com", c.getEmail());
    }

    /**
     * Test setEmail()
     */
    @Test
    void setEmail() {
        Client c = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        c.setEmail("x@email.pt");
        assertEquals("x@email.pt", c.getEmail());
    }

    /**
     * Test getPhone()
     */
    @Test
    void getPhone() {
        Client c = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        assertEquals(987654321, c.getPhone());
    }

    /**
     * Test setPhone()
     */
    @Test
    void setPhone() {
        Client c = new Client("Xu", 1234, "24/5/1998", "Rua Teste", "xu@email.com", 987654321);
        c.setPhone(912345678);
        assertEquals(912345678, c.getPhone());
    }
}