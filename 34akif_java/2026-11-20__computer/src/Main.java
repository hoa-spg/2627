//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Computer c1 = new Computer();
    Computer c2 = new Computer("hp", true, 32);

    c1.setModell("Asus Vivobook");

    c1.print();
    c2.print();

    int upgrade = c2.memoryUpgrade(6);

    c2.print();
    System.out.println("Upgrade: " + upgrade + " GB");

    upgrade = c2.memoryUpgrade(30);

    c2.print();
    System.out.println("Upgrade: " + upgrade + " GB"); // Erwartung 26 GB




}
