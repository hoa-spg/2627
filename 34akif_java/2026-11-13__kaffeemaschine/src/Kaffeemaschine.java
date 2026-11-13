public class Kaffeemaschine {
    private String modell;
    private int wasser;
    private int bohnen;
    private boolean eingeschaltet;

    public Kaffeemaschine(){
        setModell("Barista 3000");
        setWasser(1000);
        setBohnen(250);
        setEingeschaltet(false);
    }

    public Kaffeemaschine(String modell, int wasser, int bohnen){
        setModell(modell);
        setWasser(wasser);
        setBohnen(bohnen);
        setEingeschaltet(false);
    }

    public void setModell(String modell){
        if (modell != null && !modell.isBlank()) {
            this.modell=modell;
        }else {
            System.out.println("Fehler, Modell darf nicht leer sein");
        }

    }
    private void setWasser(int wasser){
        if (wasser >= 0 && wasser <= 1500){
            this.wasser=wasser;
        }else {
            System.out.println("Fehler, Wassermenge muss zwischen 0 und 1500ml sein");
        }

    }
    private void setBohnen(int bohnen){
        if (bohnen >= 0 && bohnen <= 500){
            this.bohnen=bohnen;
        }else {
            System.out.println("Fehler, es können nur 0 bis 500g Bohnen eingefügt werden");
        }
    }
    private void setEingeschaltet(boolean eingeschaltet){
        this.eingeschaltet=eingeschaltet;
    }

    public String getModell(){
        return modell;
    }
    public int getWasser(){
        return wasser;
    }
    public int getBohnen(){
        return bohnen;
    }
    public boolean isEingeschaltet(){
        return eingeschaltet;
    }

    public void einschalten(){
        if (eingeschaltet){
            System.out.println("Die Maschine ist schon eingeschaltet.");
        }else{
            this.eingeschaltet=true;
        }
    }

    public void ausschalten(){
        if (eingeschaltet){
            this.eingeschaltet=false;
        }else {
            System.out.println("Die Maschine ist schon ausgeschaltet.");
        }
    }

    public void wasserNachfuellen(){
        this.wasser=1500;
    }

    public void bohnenNachfuellen(int gramm){
        if(gramm > 0){
            int fehlendeBohnen = 500 - this.bohnen;
            if (fehlendeBohnen >= gramm){
                this.bohnen += gramm;
            }else {
                int bestandBohnen = this.bohnen;
                this.bohnen = 500;
                System.out.println("Es wurden "+(500-bestandBohnen)+"g Bohnen dazugegeben, "+(gramm -fehlendeBohnen)+"g Bohnen sind übriggeblieben");
            }
        }else{
            System.out.println("Fehler, es muss mindestens 1g Bohnen dazugefügt werden.");
        }
    }

    public boolean kaffeeZubereiten(){
        if (eingeschaltet){
            if (this.bohnen >= 10 && this.wasser >= 40){
                this.wasser -= 40;
                this.bohnen -= 10;
                System.out.println("Der Kaffee wurde zubreitet! Enjoyyy!!!!!");
                return true;
            }else{
                System.out.println("Fehler, nicht genügend Wasser oder Bohnen in der Maschine.");
                return false;
            }
        }else{
            System.out.println("Fehler, die Maschine muss an sein um einen Kaffee zu machen.");
            return false;
        }
    }

    public String toString(){
        if (eingeschaltet) {
            return modell + ", Wasser: "+wasser+"ml, Bohnen: "+bohnen+"g, eingeschaltet";
        }else {
            return modell + ", Wasser: "+wasser+"ml, Bohnen: "+bohnen+"g, ausgeschaltet";
        }
    }

    public void print(){
        System.out.println(this);
    }
}
