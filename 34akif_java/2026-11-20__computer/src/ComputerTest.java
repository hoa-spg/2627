import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void setModellWertOK() {
        Computer c = new Computer();
        c.setModell("hp");
        assertEquals("hp", c.getModell());
    }

    @org.junit.jupiter.api.Test
    void setModellWertLeer() {
        Computer c = new Computer();
        c.setModell("");
        assertEquals("Lenovo Thinkpad", c.getModell());
    }

    @org.junit.jupiter.api.Test
    void setModellWertBlank() {
        Computer c = new Computer();
        c.setModell(" ");
        assertEquals("Lenovo Thinkpad", c.getModell());
    }

    @org.junit.jupiter.api.Test
    void setModellWertNull() {
        Computer c = new Computer();
        c.setModell(null);
        assertEquals("Lenovo Thinkpad", c.getModell());
    }

    @org.junit.jupiter.api.Test
    void setMemoryWertOk() {
        // Vorbereiten
        Computer c = new Computer("Lenovo", true, 10);
        assertEquals(10, c.getMemory());

        // Durchführen
        c.setMemory(32);

        // Überprüfen
        assertEquals(32, c.getMemory());
    }

    @org.junit.jupiter.api.Test
    void setMemoryWertZuKlein() {
        // Vorbereiten
        Computer c = new Computer("Lenovo", true, 10);
        assertEquals(10, c.getMemory());

        // Durchführen
        c.setMemory(3);

        // Überprüfen
        assertEquals(10, c.getMemory());
    }

    @org.junit.jupiter.api.Test
    void setMemoryWertOkUntereGrenze() {
        // Vorbereiten
        Computer c = new Computer("Lenovo", true, 10);
        assertEquals(10, c.getMemory());

        // Durchführen
        c.setMemory(4);

        // Überprüfen
        assertEquals(4, c.getMemory());
    }

    @org.junit.jupiter.api.Test
    void setMemoryWertOkObereGrenze() {
        // Vorbereiten
        Computer c = new Computer("Lenovo", true, 10);
        assertEquals(10, c.getMemory());

        // Durchführen
        c.setMemory(64);

        // Überprüfen
        assertEquals(64, c.getMemory());
    }

    @org.junit.jupiter.api.Test
    void setMemoryWertZuHoch() {
        // Vorbereiten
        Computer c = new Computer("Lenovo", true, 10);
        assertEquals(10, c.getMemory());

        // Durchführen
        c.setMemory(65);

        // Überprüfen
        assertEquals(10, c.getMemory());
    }

    // TODO Test aller Get-Methoden
    // TODO setSsd testen

    @org.junit.jupiter.api.Test
    void upgradeToSsdMoeglich() {
        Computer c = new Computer("Lenovo", false, 10);
        assertEquals(false, c.hasSsd());

        boolean upgradeDurchgefuehrt = c.upgradeToSsd();

        assertEquals(true, c.hasSsd());
        assertEquals(true, upgradeDurchgefuehrt);
    }

    @org.junit.jupiter.api.Test
    void upgradeToSsdNichtMoeglich() {
        Computer c = new Computer("Lenovo", true, 10);
        assertEquals(true, c.hasSsd());

        boolean upgradeDurchgefuehrt = c.upgradeToSsd();

        assertEquals(true, c.hasSsd());
        assertEquals(false, upgradeDurchgefuehrt);
    }

    @org.junit.jupiter.api.Test
    void upgradeMemoryNegativerWert() {
        Computer c = new Computer("Lenovo", true, 10);
        assertEquals(10, c.getMemory());

        c.memoryUpgrade(-1);

        assertEquals(10, c.getMemory());

    }

    @org.junit.jupiter.api.Test
    void upgradeMemoryWertOk() {
        Computer c = new Computer("Lenovo", true, 10);
        assertEquals(10, c.getMemory());

        int upgraded = c.memoryUpgrade(20);

        assertEquals(30, c.getMemory());
        assertEquals(20, upgraded);
    }

    @org.junit.jupiter.api.Test
    void upgradeMemoryWertUebersteigtMaximalWert() {
        Computer c = new Computer("Lenovo", true, 10);
        assertEquals(10, c.getMemory());

        int upgraded = c.memoryUpgrade(60);

        assertEquals(64, c.getMemory());
        assertEquals(54, upgraded);

    }

}

/*

Weitere notwendige Verbesserungen dieser Testklasse


1. Konstruktoren (fehlen bisher komplett)

- Default-Konstruktor: prüfen, dass "Lenovo Thinkpad", false und 4 gesetzt sind.
- Konstruktor mit gültigen Werten: alle drei Getter prüfen. Damit ist auch das TODO „Test aller Get-Methoden“ erledigt.
- Konstruktor mit ungültigen Werten: z.B. new Computer(null, true, 2) oder new Computer("", false, 100).
  ⚠️ Dieser Test wird fehlschlagen. Weil der Setter den Wert ablehnt, bleibt das Feld auf seinem Java-Standardwert: modell == null, memory == 0. Das Objekt ist dann ungültig, obwohl memory laut Klasse mindestens 4 sein muss. Das eignet sich gut, um im Unterricht zu zeigen, wofür Tests da sind.

2. memoryUpgrade – Grenzwerte

┌─────────────────────────────────┬──────────────┬───────────────────┬─────────────────────────────┐
│              Test               │ Ausgangswert │      Aufruf       │ Erwartet: memory / Rückgabe │
├─────────────────────────────────┼──────────────┼───────────────────┼─────────────────────────────┤
│ Genau auf 64 (Grenze von <= 64) │ 10           │ memoryUpgrade(54) │ 64 / 54                     │
├─────────────────────────────────┼──────────────┼───────────────────┼─────────────────────────────┤
│ Eins über 64                    │ 10           │ memoryUpgrade(55) │ 64 / 54                     │
├─────────────────────────────────┼──────────────┼───────────────────┼─────────────────────────────┤
│ Kleinster gültiger Wert         │ 10           │ memoryUpgrade(1)  │ 11 / 1                      │
├─────────────────────────────────┼──────────────┼───────────────────┼─────────────────────────────┤
│ Wert 0 (Grenze von gb >= 1)     │ 10           │ memoryUpgrade(0)  │ 10 / 0                      │
├─────────────────────────────────┼──────────────┼───────────────────┼─────────────────────────────┤
│ Schon voll                      │ 64           │ memoryUpgrade(1)  │ 64 / 0                      │
└─────────────────────────────────┴──────────────┴───────────────────┴─────────────────────────────┘

Außerdem prüft upgradeMemoryNegativerWert den Rückgabewert (0) noch nicht. Das sollte man ergänzen.

3. setMemory

- Grenzwerte knapp innerhalb, also 5 und 63. Das ist optional, weil 4 und 64 schon getestet sind.
- Negativer Wert, z.B. -10.

4. upgradeToSsd

- Zweimal hintereinander aufrufen: Der erste Aufruf liefert true, der zweite false.

5. toString

- Computer mit SSD liefert "Marke: hp (SSD), 32 GB RAM".
- Computer ohne SSD liefert "... (HDD) ...".

6. Zum TODO „setSsd testen“

setSsd ist private und lässt sich daher nicht direkt testen. Getestet wird es indirekt über den Konstruktor, also new Computer("x", true, 8) und dann hasSsd() prüfen. Das ist ein guter Anlass, mit den Schüler:innen zu besprechen, dass man nur die öffentliche Schnittstelle testet.

Als Beispiel der Test für den Konstruktor mit ungültigen Werten (er schlägt aktuell fehl):

@org.junit.jupiter.api.Test
void konstruktorUngueltigeWerte() {
    Computer c = new Computer(null, false, 2);
    assertNotNull(c.getModell());
    assertTrue(c.getMemory() >= 4);
}

Soll ich die Tests direkt in ComputerTest.java einfügen?
 */