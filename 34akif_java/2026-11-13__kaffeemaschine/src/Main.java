void main() {
    //km1 ist die Kaffeemaschine 1 und ich habe sie verwendetzum testen aller Methoden außer dem kaffeeZubereiten

    Kaffeemaschine km1 = new Kaffeemaschine();
    //Fehlermeldung
    km1.setModell("");
    //wird eingeschlatet
    km1.einschalten();
    boolean kmAn = km1.isEingeschaltet();
    System.out.println(kmAn);
    //sagt ist schon an
    km1.einschalten();

    //wird ausgeschaltet
    km1.ausschalten();
    kmAn = km1.isEingeschaltet();
    System.out.println(kmAn);
    //ist schon aus
    km1.ausschalten();

    //der Wasserstand
    int wasserStand = km1.getWasser();
    System.out.println(wasserStand);

    //der neue (1500) Wasserstand
    km1.wasserNachfuellen();
    wasserStand = km1.getWasser();
    System.out.println(wasserStand);

    //der Bohnenstand
    int bohnenStand = km1.getBohnen();
    System.out.println(bohnenStand);

    //Fehler, 0g Bohnen
    km1.bohnenNachfuellen(0);
    bohnenStand = km1.getBohnen();
    System.out.println(bohnenStand);
    //200g Bohnen hinzugefügt, kein Rest
    km1.bohnenNachfuellen(200);
    bohnenStand = km1.getBohnen();
    System.out.println(bohnenStand);
    //50g Bohnen hinzugefügt, 100g Rest
    km1.bohnenNachfuellen(150);
    bohnenStand = km1.getBohnen();
    System.out.println(bohnenStand);
    km1.print();

    //Mit km2 habe ich kaffeeZubereiten getestet und geschaut ob es richtig abgezogen wird und ob man den Kaffee auch nur bei eingeschaltener Maschine machen kann
    Kaffeemaschine km2 = new Kaffeemaschine("Crema Delux", 760, 130);
    km2.print();
    boolean fertigKaffee = km2.kaffeeZubereiten();
    //Fehler, Maschine ausgeschaltet & false
    System.out.println(fertigKaffee);
    //Kaffee gemacht & true
    km2.einschalten();
    fertigKaffee = km2.kaffeeZubereiten();
    System.out.println(fertigKaffee);
    //Wasser um 40 weniger & Bohnen um 10 weniger als beim ersten km2.print()
    km2.print();

    Kaffeemaschine km3 = new Kaffeemaschine("Crema Delux", 30, 130);

    km3.print();
    km3.einschalten();
    //Fehler, nicht genug Wasser
    km3.kaffeeZubereiten();

    km3.wasserNachfuellen();
    km3.print();
    km3.kaffeeZubereiten();
    km3.print();

    Kaffeemaschine km4 = new Kaffeemaschine("Crema Delux", 300, 5);
    km4.print();
    km4.einschalten();
    //Fehler, nicht genug Bohnen (Die selber Fehlermeldung wie bei Wasser, weil das trennen nicht gefragt war)
    km4.kaffeeZubereiten();
}