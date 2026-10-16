public class Person {

    private String name;
    private boolean maennlich;
    private int groesse; // cm
    private int gewicht; // kg

    public Person() {
        setName("");
        setMaennlich(true);
        setGroesse(170);
        setGewicht(70);
    }

    public Person(String name, boolean maennlich, int groesse, int gewicht) {
        setName(name);
        setMaennlich(maennlich);
        setGroesse(groesse);
        setGewicht(gewicht);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            System.out.println("Fehler: ungueltiger Name: " + name);
        }
    }

    public boolean isMaennlich() {
        return maennlich;
    }

    public void setMaennlich(boolean maennlich) {
        this.maennlich = maennlich;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        if (groesse >= 110 && groesse <= 220) {
            this.groesse = groesse;
        } else {
            System.out.println("Fehler: unueltige Groesse: " + groesse);
        }
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        if (gewicht >= 30 && gewicht <= 150) {
            this.gewicht = gewicht;
        } else {
            System.out.println("Fehler: ungueltiges Gewicht: " + gewicht);
        }
    }

    public double bmiBerechnen() {
        // bmi = gewicht / groesse^2

        // lokale Variable g (Typ double)
        // Bedeutung: groesse in m
        double g = (double)groesse / 100;

        // Typumwandlung: (double) konvertiert den Wert unmittelbar danach in eine Double-Zahl

        return gewicht / (g * g);
    }

    // BMI 22: Normalgewicht
    public void bmiAusgeben() {
        double bmi = bmiBerechnen();
        if (maennlich) {
            if (bmi < 20) {
                System.out.println("BMI " + bmi + " Untergewicht");
            } else if (bmi <= 25) {
                System.out.println("BMI " + bmi + " Normalgewicht");
            } else { // bmi > 25
                System.out.println("BMI " + bmi + " Übergewicht");
            }
        } else { // weiblich
            if (bmi < 19) {
                System.out.println("BMI " + bmi + " Untergewicht");
            } else if (bmi <= 24) {
                System.out.println("BMI " + bmi + " Normalgewicht");
            } else { // bmi > 24
                System.out.println("BMI " + bmi + " Übergewicht");
            }
        }
    }

    public void print() {
        if (maennlich) {
            System.out.println(name + " (m), Groesse: " + groesse + " cm, Gewicht: " + gewicht + " kg");
        } else {
            System.out.println(name + " (w), Groesse: " + groesse + " cm, Gewicht: " + gewicht + " kg");
        }
    }
}
