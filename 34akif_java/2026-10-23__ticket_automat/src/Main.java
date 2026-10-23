//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    TicketAutomat ta = new TicketAutomat("Spengergasse", 30);

//    String ticketString = ta.ticketString();
//    System.out.println(ticketString);

    ta.einwerfen(50);
    boolean ok = ta.ticketDrucken();
    System.out.println("Hat geklappt? " + ok);

    ok = ta.ticketDrucken();
    System.out.println("Hat geklappt? " + ok);

    ta.print();

    int wechselgeld = ta.wechselGeldAuszahlen();
    System.out.println("Wechselgeld bekommen: " + wechselgeld);
    ta.print();
}
