public class Fenster
{
    private int hoehe; // cm
    private int breite; // cm
    private boolean offen;

    public Fenster() {
        setBreite(150);
        setHoehe(220);
        setOffen(true);
    }

    public Fenster(int hoehe, int breite, boolean offen) {
        setHoehe(hoehe);
        setBreite(breite);
        setOffen(offen);
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getBreite() {
        return this.breite;
    }

    public void setOffen(boolean offen) {
        this.offen = offen;
    }

    public boolean isOffen() {
        return this.offen;
    }

    public int flaeche() {
        return hoehe * breite;
    }

    public void gross() {
        if (flaeche() > 20000) {
            System.out.println("Großes Fenster");
        } else {
            System.out.println("Kleines Fenster");
        }
    }

    public void offen() {
        if (offen == true) {
            System.out.println("Fenster offen");
        } else { 
            System.out.println("Fenster geschlossen");
        }
    }

}
