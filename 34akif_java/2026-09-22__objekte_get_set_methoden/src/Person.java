public class Person {
    private String name;
    private int geburtsJahr;
    private boolean weiblich;


    // Konstruktor
    public Person() {
        setName("Max Mustermann");
        setGeburtsJahr(2001);
        setWeiblich(false);
    }

    // get/set Methoden
    public void setName(String neuerName) {
        name = neuerName;
    }

    public String getName() {
        return name;
    }

    public void setGeburtsJahr(int neuesGeburtsJahr) {
        geburtsJahr = neuesGeburtsJahr;
    }

    public int getGeburtsJahr() {
        return geburtsJahr;
    }

    public void setWeiblich(boolean neuWeiblich) {
        weiblich = neuWeiblich;
    }

    public boolean isWeiblich() {
        return weiblich;
    }


}
