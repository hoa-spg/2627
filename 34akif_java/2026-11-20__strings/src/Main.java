//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // String-Demo
    int a = 13;

    String s1 = "Hallo 3AKIF !!!";
    String s2 = "Hallo 3AKIF";
    String s3 = "Hallo 3BKIF !!!";

    s2 = s2 + " !!!";

    System.out.println("s1: " + s1);
    System.out.println("s2: " + s2);
    System.out.println("s3: " + s3);

    // Bei Test auf Gleichheit von Strings muss unbedingt
    // die equals-Methode verwendet werden!!!
    System.out.println("Strings s1 equals s2? " + s1.equals(s2));
    System.out.println("Strings s1 equals s3? " + s1.equals(s3));

    // Der == Operator testet auf Gleichheit der Instanz und nicht
    // auf Gleichheit des Inhaltes!
    System.out.println("s1 == s2: " + (s1 == s2));
    System.out.println("s1 == s3: " + (s1 == s3));

    // Länge eines Strings
    System.out.println("Länge von s1: " + s1.length());

    System.out.println("Zeichen an zweiter Stelle in s1: " + s1.charAt(0));
}
