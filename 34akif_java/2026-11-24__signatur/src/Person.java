import java.time.LocalDate;

/**
 * Kleines Demo für Signatur (ohne Parameterprüfungen)
 */
public class Person {

    private String name;
    private int geburtsjahr;

    public Person() {
        this.name = "n/a";
        this.geburtsjahr = 1970;
    }
    // TODO: Parameterprüfung für diese Klasse

    public Person(String name, int geburtsjahr) {
        this.name = name;
        this.geburtsjahr = geburtsjahr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    // TODO Parameterprüfung !
    public int alter(int jahr) {
        return jahr - geburtsjahr;
    }

    // weitere Methode für Alter: alter in diesem Jahr
    public int alter() {
        return LocalDate.now().getYear() - geburtsjahr;
    }


    // nicht möglich, wegen gleicher Signatur
    // public int alter(int jahrAlsJulianischesDatum) {
    //     return -1; // nicht implementiert
    // }

    public int alter(double jahrAlsJulianischesDatum) {
        return -1; // nicht implementiert
    }
}
