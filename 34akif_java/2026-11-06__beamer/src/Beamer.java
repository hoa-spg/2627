public class Beamer {

    private boolean eingeschaltet;
    private String raum;
    private int restzeit;

    public Beamer() {
        setRaum("n/a"); // nicht konkret vorgegeben
        setRestzeit(10); // Wert 10 festgelegt, nicht vorgegeben
        eingeschaltet = false;
    }

    public Beamer(String raum, int restzeit) {
        setRaum(raum);
        setRestzeit(restzeit);
        eingeschaltet = false;
    }

    public boolean isEingeschaltet() {
        return eingeschaltet;
    }

    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        if (raum != null && !raum.isBlank()) {
            this.raum = raum;
        } else {
            System.out.println("Fehler: ungueltiger Raum: " + raum);
        }
    }

    public int getRestzeit() {
        return restzeit;
    }

    public void setRestzeit(int restzeit) {
        if (restzeit >= 0) {
            this.restzeit = restzeit;
        } else {
            System.out.println("Fehler: ungueltige Restzeit: " + restzeit);
        }
    }

    // 1) Welche Voraussetzungen müssen erfüllt sein
    //        - Beamer muss ausgeschaltet (nicht eingeschaltet) sein
    //        - Beamer darf nicht kaputt sein, also restzeit > 0
    // 2) Was passiert wenn man den Beamer einschaltet (und Voraussetzungen erfüllt sind)
    //        - Beamer ist jetzt eingeschaltet
    //        - Restlaufzeit wird verringert (restzeit -= 1)
    public void einschalten() {
        if (!eingeschaltet) { // Beamer ist ausgeschaltet
            if (restzeit > 0) { // Beamer ist nicht kaputt!
                // Beamer einschalten (2)
                eingeschaltet = true;
                restzeit -= 1;
            } else {
                System.out.println("Fehler: Beamer ist kaputt!");
            }
        } else {
            System.out.println("Fehler: Beamer ist schon eingeschaltet.");
        }
    }

    public void ausschalten() {
        if (eingeschaltet) {
            eingeschaltet = false;
        } else {
            System.out.println("Fehler: Beamer ist schon ausgeschaltet.");
        }
    }

    public void runterwerfen() {
        restzeit = 0;
        eingeschaltet = false;
    }

    // Voraussetzung:
    //    - Beamer ist ausgeschaltet
    //    - Beamer nahe am Lebensende oder kaputt: restzeit < 5
    // Aktion (wenn Voraussetzung erfüllt):
    //    - Restzeit wird um 50 erhöht.
    public void reparieren() {
        if (!eingeschaltet) { // nicht eingeschaltet
            if (restzeit < 5) { // kaputt oder fast kaputt
                restzeit += 50; // reparieren!
            } else {
                System.out.println("Fehler: Beamer ist nicht kaputt oder fast kaputt.");
            }
        } else {
            System.out.println("Fehler: Beamer kann nicht repariert werden wenn eingeschaltet.");
        }
    }

    public String toString() {
        if (eingeschaltet) {
            if (restzeit > 0) {
                return "Beamer in Raum " + raum
                        + " (eingeschaltet), Restzeit: "
                        + restzeit + " h";
            } else {
                return "Beamer in Raum " + raum
                        + " (eingeschaltet), Restzeit: "
                        + restzeit + " h, Ende der Lebensdauer erreicht.";
            }
        } else { // ist ausgeschaltet
            if (restzeit > 0 ) {
                return "Beamer in Raum " + raum
                        + " (ausgeschaltet), Restzeit: "
                        + restzeit + " h";
            } else {
                return "Beamer in Raum " + raum
                        + " (ausgeschaltet), Restzeit: "
                        + restzeit + " h, KAPUTT!";
            }
        }
    }

    public void print() {
        System.out.println(this);
    }
}
