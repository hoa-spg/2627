

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
}