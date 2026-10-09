public class Student {
    private String name;
    private char geschlecht; // 'm', 'w'
    private int geburtsJahr;
    private double durchschnittsNote;

    public Student() {
        setName("Max Mustermann");
        setGeschlecht('m');
        setGeburtsJahr(1990);
        setDurchschnittsNote(2.5);
    }

    public Student(String neuerName, char neuesGeschlecht, int geburtsJahr, double neueDurchschnittsNote) {
        setName(neuerName);
        setGeschlecht(neuesGeschlecht);
        setGeburtsJahr(geburtsJahr);
        setDurchschnittsNote(neueDurchschnittsNote);
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Fehler: ungueltiger Name");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setGeschlecht(char geschlecht) {
        if (geschlecht == 'm' || geschlecht == 'w') {
            this.geschlecht = geschlecht;
        } else {
            System.out.println("FEHLER: ungueltiges Geschlecht: " + geschlecht);
        }
    }

    public char getGeschlecht() {
        return this.geschlecht;
    }

    public void setGeburtsJahr(int geburtsJahr) {
        if (geburtsJahr >= 1900 && geburtsJahr < 2027) {
            this.geburtsJahr = geburtsJahr;
        } else {
            System.out.println("FEHLER: Ungueltiges Geburtsjahr " + geburtsJahr);
        }
    }

    public int getGeburtsJahr() {
        return this.geburtsJahr;
    }

    public void setDurchschnittsNote(double durchschnittsNote) {
        if (durchschnittsNote >= 1.0 && durchschnittsNote <= 5.0) {
            this.durchschnittsNote = durchschnittsNote;
        } else {
            System.out.println("FEHLER: Durchschnitts-Note muss größer oder gleich 1 sein.");
        }
    }

    public double getDurchschnittsNote() {
        return durchschnittsNote;
    }

    // Diese Methode berechnet Alter im Jahr 2026
    public int berechneAlter() {
        return 2026 - this.geburtsJahr;
    }

    // Diese Methode berechnet Alter im Jahr jahr.
    // jahr ist hier der Parameter
    public int berechneAlterImJahr(int jahr) {
        return jahr - this.geburtsJahr;
    }

    public void print() {
        if (geschlecht == 'm') {
            System.out.println(name + " (männlich), Geburtsjahr: " + geburtsJahr + ", Durschnitts-Note: " + durchschnittsNote);
        } else { // geschlecht == 'w'
            System.out.println(name + " (weiblich), Geburtsjahr: " + geburtsJahr + ", Durschnitts-Note: " + durchschnittsNote);
        }
    }

}
