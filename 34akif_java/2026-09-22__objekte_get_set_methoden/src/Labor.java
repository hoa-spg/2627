public class Labor {
    private String raum;
    private int anzahlPlaetze;
    private boolean computerLabor;

    public Labor() {
        setRaum("B4.17MF");
        setAnzahlPlaetze(25);
        setComputerLabor(true);
    }

    public Labor(String neuerRaum) {
        setRaum(neuerRaum);
        setAnzahlPlaetze(25);
        setComputerLabor(true);
    }

    public Labor(String neuerRaum, int neueAnzahlPlaetze, boolean neuComputerLabor) {
        setRaum(neuerRaum);
        setAnzahlPlaetze(neueAnzahlPlaetze);
        setComputerLabor(neuComputerLabor);
    }

    public void setRaum(String neuerRaum) {
        raum = neuerRaum;
    }

    public String getRaum() {
        return raum;
    }

    public void setAnzahlPlaetze(int neueAnzahlPlaetze) {
        anzahlPlaetze = neueAnzahlPlaetze;
    }

    public int getAnzahlPlaetze() {
        return anzahlPlaetze;
    }

    public void setComputerLabor(boolean neuComputerLabor) {
        computerLabor = neuComputerLabor;
    }

    public boolean isComputerLabor() {
        return computerLabor;
    }
}
