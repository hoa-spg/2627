
public class Wohnung {

    private String adresse;
    private int groesse;
    private boolean balkon;
    private int monatsMiete;

    public Wohnung() {
        setAdresse("n/a");
        setGroesse(30);
        setMonatsMiete(100);
        setBalkon(false);
    }

    public Wohnung(String adresse, int groesse, boolean balkon, int monatsMiete) {
        setAdresse(adresse);
        setGroesse(groesse);
        setMonatsMiete(monatsMiete);
        setBalkon(balkon);
    }

    public void setAdresse(String adresse) {
        if (adresse != null && !adresse.isBlank()) {
            this.adresse = adresse;
        } else {
            System.out.println("Ungültige Adresse");
        }
    }

    public String getAdresse() {
        return adresse;
    }

    public void setGroesse(int groesse) {
        if (groesse >= 30 && groesse <= 600) {
            this.groesse = groesse;
        } else {
            System.out.println("Ungültige Größe!");
        }
    }

    public int getGroesse() {
        return groesse;
    }

    public void setMonatsMiete(int monatsMiete) {
        if (balkon) { // balkon == true
            if (monatsMiete >= 150 && monatsMiete <= 3500) {
                this.monatsMiete = monatsMiete;
            } else {
                System.out.println("Ungültige Monatsmiete");
            }
        } else { // balkon == false
            if (monatsMiete >= 100 && monatsMiete <= 3500) {
                this.monatsMiete = monatsMiete;
            } else {
                System.out.println("Ungültige Monatsmiete");
            }
        }
    }

    public int getMonatsMiete() {
        return monatsMiete;
    }

    public void setBalkon(boolean balkon) {
//        if (!balkon || monatsMiete >= 150) {
//            this.balkon = balkon;
//        } else {
//            System.out.println("Ungültige Monatsmiete");
//        }
        if (balkon) {
            if (monatsMiete >= 150) {
                this.balkon = balkon;
            } else {
                System.out.println("Ungültige Monatsmiete bei vorhandenem Balkon");
            }
        } else { // kein Balkon (keine Prüfung notwendig)
            this.balkon = balkon;
        }
    }

    public boolean getBalkon() {
        return balkon;
    }

    public void print() {
        if (balkon) {
            System.out.println(adresse + ": " + groesse + " m² (mit Balkon), MM: " + monatsMiete + " Euro");
        } else {
            System.out.println(adresse + ": " + groesse + " m² (ohne Balkon), MM: " + monatsMiete + " Euro");
        }
    }
}












