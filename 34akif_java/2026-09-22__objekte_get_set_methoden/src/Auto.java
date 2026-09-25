public class Auto {
    private String marke;
    private int baujahr;
    private boolean automatik;

    public Auto() {
        setMarke("Mercedes");
        setBaujahr(1990);
        setAutomatik(true);
    }

    public void setMarke(String neueMarke) {
        marke = neueMarke;
    }

    public String getMarke() {
        return marke;
    }

    public void setBaujahr(int neuesBaujahr) {
        baujahr = neuesBaujahr;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setAutomatik(boolean neuAutomatik) {
        automatik = neuAutomatik;
    }

    public boolean hasAutomatik() {
        return automatik;
    }

}
