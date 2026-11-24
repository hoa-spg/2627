public class Computer {
    private String modell;
    private boolean ssd;
    private int memory;

    public Computer() {
    }

    public Computer(String modell, boolean ssd, int memory) {
        this.modell = modell;
        this.ssd = ssd;
        this.memory = memory;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "modell='" + modell + '\'' +
                ", ssd=" + ssd +
                ", memory=" + memory +
                '}';
    }
}
