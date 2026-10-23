public class TicketAutomat {

    private String standort;
    private int ticketPreis; // cent
    private int eingeworfenesGuthaben; // cent
    private int gesamtEinnahmen; // cent

    public TicketAutomat(String standort, int ticketPreis) {
        if (standort != null && !standort.isBlank()) {
            this.standort = standort;
        } else {
            System.out.println("Fehler: ungueltiger Stanort.");
        }
        setTicketPreis(ticketPreis);
        this.eingeworfenesGuthaben = 0;
        this.gesamtEinnahmen = 0;
    }


    public int getTicketPreis() {
        return this.ticketPreis;
    }

    public void setTicketPreis(int ticketPreis) {
        if (ticketPreis > 0) {
            this.ticketPreis = ticketPreis;
        } else {
            System.out.println("Fehler: ungueltiger Ticketpreis: " + ticketPreis);
        }
    }

    public int getEingeworfenesGuthaben() {
        return this.eingeworfenesGuthaben;
    }

    public int getGesamtEinnahmen() {
        return this.gesamtEinnahmen;
    }

    public void einwerfen(int betrag) {
        if (betrag > 0) {
//            this.eingeworfenesGuthaben = this.eingeworfenesGuthaben + betrag;
            this.eingeworfenesGuthaben += betrag;
        } else {
            System.out.println("Fehler: ungueltiger Betrag: " + betrag);
        }
    }

    public String ticketString() {
        return "######### \n FAHRSCHEIN \n Standort: " + this.standort + "\n Preis " + this.ticketPreis/100.0 + " Euro\n#########"; // TODO
    }

    public boolean ticketDrucken() {
        if (eingeworfenesGuthaben >= ticketPreis) {
            eingeworfenesGuthaben -= ticketPreis;
            gesamtEinnahmen += ticketPreis;
            System.out.println(ticketString());
            return true;
        } else {
            System.out.println("Nicht genug Guthaben vorhanden. Weitere " + (ticketPreis - eingeworfenesGuthaben) + " benötigt.");
            return false;
        }
    }

    public int wechselGeldAuszahlen() {
        int guthaben = eingeworfenesGuthaben;
        eingeworfenesGuthaben = 0;
        return guthaben;
    }

    public String toString() {
        return "TicketAutomat " + standort + " TicketPreis: " + ticketPreis + " Eingeworfenes Guthaben: " + eingeworfenesGuthaben + " Gesamteinnahmen: " + gesamtEinnahmen; // TODO
    }

    public void print() {
        System.out.println(this);
    }

}
