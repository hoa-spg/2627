public class Computer {

    private String modell;
    private boolean ssd;
    private int memory; // GB

    public Computer() {
        setModell("Lenovo Thinkpad");
        setSsd(false);
        setMemory(4);
    }

    public Computer(String modell, boolean ssd, int memory) {
        setModell(modell);
        setSsd(ssd);
        setMemory(memory);
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        if (modell != null && !modell.isBlank()) {
            this.modell = modell;
        } else {
            System.out.println("Fehler: ungueltiges Modell: " + modell);
        }
    }

    public boolean hasSsd() {
        return ssd;
    }

    private void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public int getMemory() {
        return memory;
    }

    private void setMemory(int memory) {
        if (memory >= 4 && memory <= 64) {
            this.memory = memory;
        } else {
            System.out.println("Fehler: ungueltiges Memory: " + memory);
        }
    }

    public boolean upgradeToSsd() {
        if (!ssd) { // Computer hat noch keine SSD (ssd == false)
            ssd = true;
            return true;
        }  else { // Computer hat schon eine SSD (kein Upgrade möglich)
            System.out.println("Computer hat schon eine SSD (kein Upgrade möglich)");
            return false;
        }
    }

    /**
     * Methode gibt tatsächlich hinzugefügtes Memory zurück. Der
     * Computer darf maximal 64 GB Memory enthalten. Würde dieser
     * Wert durch ein Upgrade überschritten werden, so wird nur die
     * Differenz auf 64 GB hinzugefügt.
     *
     * Angenommen memory 32 GB
     * memoryUpgrade(6) -> Rückgabewert 6, this.memory = 38
     *
     * Angenommen memory 32 GB
     * memoryUpgrade(40) -> 32, this.memory = 64
     *
     */
    public int memoryUpgrade(int gb) {
        if (gb >= 1) {
            if (this.memory + gb <= 64) {
                this.memory = this.memory + gb;
                return gb;
            } else {
                int memoryVorUpgrade = this.memory;
                this.memory = 64;
                return 64 - memoryVorUpgrade;
            }
        } else {
            System.out.println("Fehler: ungueltiger Wert für Upgrade: " + gb);
            return 0;
        }
    }

    public String toString() {
        if (hasSsd()) {
            return "Marke: " + getModell() + " (SSD), " + getMemory() + " GB RAM";
        } else {
            return "Marke: " + getModell() + " (HDD), " + getMemory() + " GB RAM";
        }
    }

    public void print() {
        System.out.println(this);
    }

}
