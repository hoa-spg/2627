

// main() ist der Einstiegspunkt in das Programm

//void main() {
//    Config c = new Config();
//    Hauptfenster fenster = new Hauptfenster(c);
//    fenster.oeffnen();
//}

// Für uns ist main zunächst die "Sandkiste". Hier können
// wir die Objekte erzeugen und Methoden aufrufen. (Also
// all das was wir bisher in der Object-Workbench getan haben)

void main() {
    System.out.println("Hello World!");

    // Mit dem Schlüsselwort new gefolgt von einem
    // Konstruktor werden neue Objekte erzeugt.
    // stud ... Referenz auf ein Objekt der Klasse Student
    //          "Objekt-Referenz"
    // Vor stud muss die Klasse angegeben werden (Deklaration)
    Student stud = new Student();

    stud.print();
    
    stud.setName("Alice");
    stud.setGeburtsJahr(1996);
    stud.setGeschlecht('w');

    stud.print();

    Student stud2 = new Student("Bob", 'm', 1997);
    stud2.print();

    Student stud3 = new Student("Clemens", 'm', 1998);
    stud3.print();

    Student stud4 = new Student();
    stud4.setName("Clemens");
    stud4.setGeschlecht('m');
    stud4.setGeburtsJahr(1998);
    stud4.print();

    Student stud5 = new Student("X", 'd', 2001);
    stud5.print();
}