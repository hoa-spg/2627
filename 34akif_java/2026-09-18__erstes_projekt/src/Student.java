public class Student {

    private String name;
    private int geburtsjahr;
    private boolean weiblich;

    public Student(String name) {
        setName(name);
    }

    public Student(String name, int geburtsjahr) {
        setName(name);
        this.geburtsjahr = geburtsjahr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public void setWeiblich(boolean neuWeiblich) {
        weiblich = true;

    }

    public void print() {
        System.out.println("ASDF");
    }

    public void print2() {
        System.out.println("Print 2");
    }

    public void print3() {
        System.out.println("Print 3");
    }

}
