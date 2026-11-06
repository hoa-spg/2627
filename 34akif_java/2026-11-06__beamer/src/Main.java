//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Beamer b = new Beamer("C3.08", 5);
    b.print();

    b.einschalten();
    b.print();

    b.einschalten(); // ist aber schon eingeschaltet --> Fehler
    b.print();

    b.ausschalten();
    b.print();

    b.ausschalten(); // ist schon ausgeschaltet --> Fehler
    b.print();

    System.out.println("----------------------");
    Beamer b2 = new Beamer("C3.09", 5);

    b2.einschalten();
    b2.print();
    b2.runterwerfen();

    // Beamer runterwerfen
    //    -> ist kaputt ==> restzeit = 0
    //    -> Beamer muss nachher ausgeschaltet sein!
    b2.print(); // Beamer in Raum C3.09 (ausgeschaltet), Restzeit: 0 h, KAPUTT!

    b2.reparieren();
    b2.print();
    // Beamer in Raum C3.09 (eingeschaltet), Restzeit: 50 h

    System.out.println("--- Test ob reparieren von fast kaputtem Beamer möglich (wenn ausgeschaltet):");

    Beamer b3 = new Beamer("B3.10", 3);
    b3.print();
    b3.reparieren();
    b3.print(); // -> Ist repariert, Restlaufzeit 53 Stunden

    System.out.println("--- Test ob reparieren von fast kaputtem Beamer möglich (wenn eingeschaltet):");


    Beamer b4 = new Beamer("B3.11", 3);
    b4.einschalten();
    b4.print();

    b4.reparieren();
    b4.print(); // Erwartung: Reparieren nicht möglich

    System.out.println("--- Test ob Ausgabe am Ende der Lebensdauer korrekt.");
    Beamer b5 = new Beamer("B3.12", 1);
    b5.print();
    b5.einschalten();
    b5.print();
    b5.ausschalten();
    b5.print();
}
