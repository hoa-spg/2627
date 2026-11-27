import java.time.LocalDate;
import java.util.Random;

public class Student {

    private String vorname;
    private String nachname;
    private char geschlecht; // 'm', 'w', 'x'
    private int geburtsjahr;
    private boolean inskribiert;

    // parameterloser Konstruktor: Standardwerte
    public Student() {
        setVorname("n/a");
        setNachname("n/a");
        setGeschlecht('x');
        setGeburtsjahr(2000);
        inskribiert = true;
    }

    public Student(String vorname, String nachname, char geschlecht, int geburtsjahr) {
        setVorname(vorname);
        setNachname(nachname);
        setGeschlecht(geschlecht);
        setGeburtsjahr(geburtsjahr);
        inskribiert = true; // neuer Student ist inskribiert
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        // Reihenfolge wichtig: zuerst auf null pruefen, dann erst strip() aufrufen!
        if (vorname != null && vorname.strip().length() >= 2) {
            this.vorname = vorname.strip();
        } else {
            System.out.println("Fehler: ungueltiger Vorname: " + vorname);
        }
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        if (nachname != null && nachname.strip().length() >= 2) {
            this.nachname = nachname.strip();
        } else {
            System.out.println("Fehler: ungueltiger Nachname: " + nachname);
        }
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        if (geschlecht == 'm' || geschlecht == 'w' || geschlecht == 'x') {
            this.geschlecht = geschlecht;
        } else {
            System.out.println("Fehler: ungueltiges Geschlecht: " + geschlecht);
        }
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        int aktuellesJahr = LocalDate.now().getYear();
        if (geburtsjahr >= 1900 && geburtsjahr <= aktuellesJahr) {
            this.geburtsjahr = geburtsjahr;
        } else {
            System.out.println("Fehler: ungueltiges Geburtsjahr: " + geburtsjahr);
        }
    }

    public boolean isInskribiert() {
        return inskribiert;
    }


    public void inskribieren() {
        // TODO
    }

    public void exmatrikulieren() {
        // TODO
    }

    // Max Mustermann -> "M. M."
    public String initialen() {
        return ""; // TODO
    }

    public boolean istDoppelname() {
        return false; // TODO
    }

    // Alter im aktuellen Jahr: keinen Code doppelt schreiben,
    // sondern die Methode mit Parameter aufrufen
    public int berechneAlter() {
        return -1; // TODO
    }

    // liefert -1, wenn das Jahr vor dem Geburtsjahr liegt
    public int berechneAlterImJahr(int jahr) {
        return -1; // TODO
    }

    public boolean istVolljaehrig() {
        return false; // TODO
    }

    public boolean istVolljaehrigImJahr(int jahr) {
        // bei ungueltigem Jahr liefert berechneAlterImJahr -1, also false
        return false; // TODO
    }

    public String anrede() {
        return ""; // TODO
    }

    // char-Werte koennen verglichen werden: 'a' bis 'z' und 'A' bis 'Z'
    // liegen jeweils direkt hintereinander, die Umlaute liegen ausserhalb
    // -> einzeln pruefen.
    private boolean istBuchstabe(char c) {
        return false; // TODO
    }

    // E-Mail: 3 Buchstaben Nachname + 5 Zufallsziffern + @spengergasse.at
    // Ist das 3. Zeichen des Nachnamens kein Buchstabe (oder gibt es keines),
    // werden 2 Buchstaben vom Nachnamen und 1 vom Vornamen genommen:
    //   Li Wu -> wul12345@spengergasse.at, Anna Al-Hassan -> ala12345@...
    // Die E-Mail wird nicht gespeichert: jeder Aufruf liefert andere Ziffern.
    // Im Fehlerfall wird null zurueckgegeben.
    public String generiereEmail() {
        return ""; // TODO
    }

    // Zusatz: Anna Al-Hassan -> "A. A.-H.", Eva van Dyk -> "E. V. D."
    // keinen Code doppelt schreiben: zuerst initialen() aufrufen
    public String initialen2() {
        return ""; // TODO
    }

    public String toString() {
        String status;
        if (inskribiert) {
            status = "inskribiert";
        } else {
            status = "exmatrikuliert";
        }
        return "Student " + vorname + " " + nachname + " (" + geschlecht + "), Jahrgang "
                + geburtsjahr + ", " + status;
    }

    public void print() {
        System.out.println(this);
    }
}
