import static org.junit.jupiter.api.Assertions.*;

class KaffeemaschineTest {

    @org.junit.jupiter.api.Test
    void einschalten() {

        Kaffeemaschine km1 = new Kaffeemaschine();
        // ist ausgeschaltet
        km1.einschalten();
        boolean kmAn = km1.isEingeschaltet();

        assertEquals(true, kmAn); // Erwartung: kmAn ist true (ist eingeschaltet)
    }

    @org.junit.jupiter.api.Test
    void bohnenNachfuellen() {
        Kaffeemaschine km1 = new Kaffeemaschine();
        int bohnen = km1.getBohnen();
        assertEquals(250, bohnen);

        km1.bohnenNachfuellen(200);
        assertEquals(450, km1.getBohnen());
    }

    @org.junit.jupiter.api.Test
    void bohnenNachfuellenMitUngueltigemWert() {
        Kaffeemaschine km1 = new Kaffeemaschine();
        int bohnen = km1.getBohnen();
        assertEquals(250, bohnen);

        km1.bohnenNachfuellen(-50);
        assertEquals(250, km1.getBohnen());
    }
}