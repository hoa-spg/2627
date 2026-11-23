import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void setModell() {
    }

    @org.junit.jupiter.api.Test
    void setMemory() {
        // Vorbereiten
        Computer c = new Computer("Lenovo", true, 10);
        assertEquals(10, c.getMemory());

        // Durchführen
        // c.setMemory(32);

        // Überprüfen
    }


}