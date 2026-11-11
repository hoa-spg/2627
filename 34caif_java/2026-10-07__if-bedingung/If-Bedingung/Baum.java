
public class Baum {
    private int hoehe; // cm
    private String farbe;
    private boolean hatBlaetter;
    
    public Baum() {
      setHoehe(350);
      setFarbe("grün");
      setHatBlaetter(false);
    }
    
    public Baum(int hoehe, String farbe, boolean hatBlaetter) {
        setHoehe(hoehe);
        setFarbe(farbe);
        setHatBlaetter(hatBlaetter);
    }

    public void setHoehe(int hoehe) {
        if (hoehe > 0) {
            if (hoehe < 10_000) { // 100m 
                this.hoehe = hoehe;
            } else {
                System.out.println("Fehler: ungueltige Höhe " + hoehe + ". Höhe muss kleiner als 100m sein!");
            }
        } else {
            System.out.println("Fehler: ungueltige Höhe " + hoehe + ". Höhe muss positiv sein!");
        }
        
    }
    
    public int getHoehe() {
        return this.hoehe;
    }
    
    public void setFarbe(String farbe) {
        if (farbe != null) {
            this.farbe = farbe;
        } else {
           System.out.println("Fehler: farbe darf nicht null sein!");
        }
    }
    
    public String getFarbe() {
        return this.farbe;
    }
    
    public void setHatBlaetter(boolean hatBlaetter) {
        this.hatBlaetter = hatBlaetter;
    }
    
    public boolean hasBlaetter() {
        return this.hatBlaetter;
    }
    
    public void pruefeHoehe() {
        if (hoehe > 1500) {
            System.out.println("Der Baum ist sehr hoch");
        } 
    }
    
    public boolean gesund() {
        if (farbe.equals("grün")) {
            if (hatBlaetter) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
}
