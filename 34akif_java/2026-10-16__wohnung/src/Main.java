//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Wohnung wohnung1 = new Wohnung();


    // wohnung1.print();
    wohnung1.setAdresse("Kärtnerstraße 259/2/13, 1010 Wien");
    wohnung1.setGroesse(77);
    wohnung1.setMonatsMiete(920);
    wohnung1.setBalkon(true);

    wohnung1.print();

    // Erwartung: nicht möglich, weil Balkon vorhanden
    wohnung1.setMonatsMiete(130);

    wohnung1.print();

    wohnung1.setBalkon(false);
    wohnung1.setMonatsMiete(130);

    wohnung1.print();

    // Erwartung: wird nicht gesetzt, weil Miete zu gering für Wohnung mit Balkon
    wohnung1.setBalkon(true);
    wohnung1.print();
}