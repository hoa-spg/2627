//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Random rnd = new Random();
    int zufallszahl = 10000 + rnd.nextInt(90000);
    System.out.println("Zufallszahl: " + zufallszahl);

    Person p = new Person("Fanz", 2001);
    System.out.println(p.alter(2022));
}
