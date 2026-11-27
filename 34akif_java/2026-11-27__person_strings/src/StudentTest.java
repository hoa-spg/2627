import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void inskribieren() {
        Student s = new Student();
        s.exmatrikulieren();
        assertEquals(false, s.isInskribiert());

        s.inskribieren();

        assertEquals(true, s.isInskribiert());

        s.inskribieren(); // Fehlermeldung
    }

    @org.junit.jupiter.api.Test
    void exmatrikulieren() {
    }

    @org.junit.jupiter.api.Test
    void initialen() {
        Student s = new Student("Norbert", "Mustermann", 'm', 1990);

        assertEquals("N. M.", s.initialen());
    }

    @org.junit.jupiter.api.Test
    void istDoppelnameKeinDoppelname() {
        Student s = new Student("Norbert", "Mustermann", 'm', 1990);
        assertEquals(false, s.istDoppelname());
    }


    @org.junit.jupiter.api.Test
    void istDoppelnameMitLeerzeichen() {
        Student s = new Student("Norbert", "Mustermann Musterfau", 'm', 1990);
        assertEquals(true, s.istDoppelname());
    }


    @org.junit.jupiter.api.Test
    void istDoppelnameMitBindestrich() {
        Student s = new Student("Norbert", "Mustermann-Musterfau", 'm', 1990);
        assertEquals(true, s.istDoppelname());

    }

    @org.junit.jupiter.api.Test
    void berechneAlter() {
        Student s = new Student("Norbert", "Mustermann-Musterfau", 'm', 1990);
        assertEquals(36, s.berechneAlter());
    }

    @org.junit.jupiter.api.Test
    void berechneAlterImJahr() {
        Student s = new Student("Norbert", "Mustermann-Musterfau", 'm', 1990);
        assertEquals(20, s.berechneAlterImJahr(2010));
    }

    @org.junit.jupiter.api.Test
    void istVolljaehrig() {
    }

    @org.junit.jupiter.api.Test
    void istVolljaehrigImJahr() {
    }

    @org.junit.jupiter.api.Test
    void anrede() {
    }

    @org.junit.jupiter.api.Test
    void generiereEmail() {
        Student s = new Student("Norbert", "Mustermann-Musterfau", 'm', 1990);
        s.print();
        System.out.println("Email: " + s.generiereEmail());
    }

    @org.junit.jupiter.api.Test
    void initialen2() {
    }
}