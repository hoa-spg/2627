public class Student {

    private String vorname;
    private String nachname;
    private char geschlecht;
    private int geburtsjahr;
    private boolean inskribiert;
    
    public Student() 
    {
        
    }

    public Student(String vorname, String nachname, char geschlecht, int geburtsjahr) 
    {

    }

    public String getVorname() 
    {
        return vorname;
    }

    public void setVorname(String vorname) 
    {
        this.vorname = vorname;
    }

    public String getNachname() 
    {
        return nachname;
    }

    public void setNachname(String nachname) 
    {
        this.nachname = nachname;
    }

    public char getGeschlecht() 
    {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) 
    {
        this.geschlecht = geschlecht;
    }

    public int getGeburtsjahr() 
    {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) 
    {
        this.geburtsjahr = geburtsjahr;
    }

    public boolean isInskribiert() 
    {
        return inskribiert;
    }
    
}
