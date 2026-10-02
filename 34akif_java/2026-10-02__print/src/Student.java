public class Student {
    private String name;
    private char geschlecht; // 'm', 'w'
    private double durchschnittsNote;

    public Student() {
        setName("Max Mustermann");
        setGeschlecht('m');
        setDurchschnittsNote(2.5);
    }

    public Student(String neuerName, char neuesGeschlecht, double neueDurchschnittsNote) {
        setName(neuerName);
        setGeschlecht(neuesGeschlecht);
        setDurchschnittsNote(neueDurchschnittsNote);
    }

    public void setName(String neuerName) {
        name = neuerName;
    }

    public String getName() {
        return name;
    }

    public void setGeschlecht(char neuesGeschlecht) {
        geschlecht = neuesGeschlecht;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setDurchschnittsNote(double neueDurchschnittsNote) {
        durchschnittsNote = neueDurchschnittsNote;
    }

    public double getDurchschnittsNote() {
        return durchschnittsNote;
    }

    public void print() {
        if (geschlecht == 'm') {
            System.out.println(name + " (männlich), Durschnitts-Note: " + durchschnittsNote);
        } else { // geschlecht == 'w'
            System.out.println(name + " (weiblich), Durschnitts-Note: " + durchschnittsNote);
        }
    }

}
