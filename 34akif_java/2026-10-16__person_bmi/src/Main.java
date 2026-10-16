//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Person p = new Person("Lukas", true, 180, 80);
    p.print();
    p.bmiAusgeben();

    p.setName("Lucie");
    p.setMaennlich(false);

    p.print();
    p.bmiAusgeben();

    // bmi ist hier eine "lokale Variable"
//    String name = p.getName();
//    double bmi = p.bmiBerechnen();
//    System.out.println("bmi: " + bmi);
//    System.out.println("name: " + name);
//
//    double x = 42.34;
//    System.out.println("x: " + (char)x);

}
