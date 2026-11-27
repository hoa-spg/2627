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
        if (!inskribiert) {
            inskribiert = true;
        } else {
            System.out.println("Fehler: ist schon inskribiert.");
        }
    }

    public void exmatrikulieren() {
        if (inskribiert) {
            inskribiert = false;
        } else {
            System.out.println("Fehler: ist schon exmatrikuliert.");
        }
    }

    // Max Mustermann -> "M. M."
    public String initialen() {
        return vorname.substring(0, 1).toUpperCase() + ". " + nachname.substring(0, 1).toUpperCase() + ".";
    }

    public boolean istDoppelname() {
        return nachname.contains(" ") || nachname.contains("-");
    }

    // Alter im aktuellen Jahr: keinen Code doppelt schreiben,
    // sondern die Methode mit Parameter aufrufen
    public int berechneAlter() {
        return berechneAlterImJahr(LocalDate.now().getYear());
    }

    // liefert -1, wenn das Jahr vor dem Geburtsjahr liegt
    public int berechneAlterImJahr(int jahr) {
        if (jahr >= geburtsjahr) {
            return jahr - geburtsjahr;
        } else {
            System.out.println("Fehler: " + jahr + " ist kleiner als Geburtsjahr " + geburtsjahr);
            return -1;
        }
    }

    public boolean istVolljaehrig() {
        return istVolljaehrigImJahr(LocalDate.now().getYear());
    }

    /**
     * Diese Methode ermittelt, ob die Person im angegeben
     * Jahr volljährig ist.
     *
     * @param jahr Jahr in dem auf Volljährigkeit geprüft wird
     * @return gibt an ob Person volljährig ist oder nicht.
     */
    public boolean istVolljaehrigImJahr(int jahr) {
        return berechneAlterImJahr(jahr) >= 18;
    }

    public String anrede() {
        if (geschlecht == 'm') {
            return "Sehr geehrter Herr " + nachname;
        } else if (geschlecht == 'w') {
            return "Sehr geehrte Frau " + nachname;
        } else if (geschlecht == 'x') {
            return "Guten Tag " + vorname + " " + nachname;
        } else {
            System.out.println("Fehler: ungueltiges Geschlecht: " + geschlecht);
            return "";
        }
    }

    // char-Werte koennen verglichen werden: 'a' bis 'z' und 'A' bis 'Z'
    // liegen jeweils direkt hintereinander, die Umlaute liegen ausserhalb
    // -> einzeln pruefen.
    private boolean istBuchstabe(char c) {
        return (c >= 'A' && c <= 'Z')
                || (c >= 'a' && c <= 'z')
                || c == 'Ä' || c == 'ä'
                || c == 'Ö' || c == 'ö'
                || c == 'Ü' || c == 'ü'
                || c == 'ß';
    }

    // E-Mail: 3 Buchstaben Nachname + 5 Zufallsziffern + @spengergasse.at
    // Ist das 3. Zeichen des Nachnamens kein Buchstabe (oder gibt es keines),
    // werden 2 Buchstaben vom Nachnamen und 1 vom Vornamen genommen:
    //   Li Wu -> wul12345@spengergasse.at, Anna Al-Hassan -> ala12345@...
    // Die E-Mail wird nicht gespeichert: jeder Aufruf liefert andere Ziffern.
    // Im Fehlerfall wird null zurueckgegeben.
    public String generiereEmail() {
        String kuerzel = "";

        if (nachname.length() >= 3) {
            kuerzel = nachname.substring(0, 3);
        } else {
            kuerzel = nachname.substring(0, 2) + vorname.substring(0, 1);
        }

        if (istBuchstabe(kuerzel.charAt(0))
                && istBuchstabe(kuerzel.charAt(1))
                && istBuchstabe(kuerzel.charAt(2)))
        {
            Random rnd = new Random();
            int zahl = rnd.nextInt(100_000);

            return kuerzel.toLowerCase() + String.format("%05d", zahl) + "@spengergasse.at";
        } else {
            System.out.println("Fehler: ungueltige Zeichen im Namen.");
            return "";
        }

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
