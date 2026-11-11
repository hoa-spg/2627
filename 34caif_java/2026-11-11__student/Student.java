import java.time.Year;
import java.util.Random;

public class Student {

    private String vorname;
    private String nachname;
    private char geschlecht;
    private int geburtsjahr;
    private boolean inskribiert;
    
    public Student() 
    {
        setVorname("n/a");
        setNachname("n/a");
        setGeschlecht('x');
        setGeburtsjahr(2000);
        inskribiert = true;
    }

    public Student(String vorname, String nachname, char geschlecht, int geburtsjahr) 
    {
        setVorname(vorname);
        setNachname(nachname);
        setGeschlecht(geschlecht);
        setGeburtsjahr(geburtsjahr);
        inskribiert = true;
    }

    public String getVorname() 
    {
        return vorname;
    }

    public void setVorname(String vorname) 
    {
        if (vorname != null && vorname.strip().length() >= 2) 
        {
            this.vorname = vorname.strip();
        } 
        else 
        {
            System.out.println("Fehler: ungueltiger Vorname: " + vorname);
        }
        
    }

    public String getNachname() 
    {
        return nachname;
    }

    public void setNachname(String nachname) 
    {
        if (nachname != null && nachname.strip().length() >= 2) 
        {
            this.nachname = nachname.strip();
        }
        else 
        {
            System.out.println("Fehler: ungueltiger Nachname: " + nachname);
        }
    }

    public char getGeschlecht() 
    {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) 
    {
        if (geschlecht == 'm' || geschlecht == 'w' || geschlecht == 'x') 
        {
            this.geschlecht = geschlecht;
        }
        else 
        {
            System.out.println("Fehler: Geschlecht muss m, w oder x sein!");
        }
    }

    public int getGeburtsjahr() 
    {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) 
    {
        if (geburtsjahr >= 1900 && geburtsjahr <= Year.now().getValue()) 
        {
            this.geburtsjahr = geburtsjahr;
        } 
        else 
        {
            System.out.println("Fehler: ungueltiges Geburtsjahr: " + geburtsjahr);
        }
    }

    public boolean isInskribiert() 
    {
        return inskribiert;
    }
    
    public String initialen() 
    {
        return vorname.charAt(0) + ". " + nachname.charAt(0) + ".";    
    }
    
    public boolean istDoppelname() 
    {
        return nachname.contains("-") || nachname.contains(" ");
    }
    
    public int berechneAlter() 
    {
        // return Year.now().getValue() - geburtsjahr;
        return berechneAlterImJahr(Year.now().getValue());
    }
    
    public int berechneAlterImJahr(int jahr) 
    {
        if (geburtsjahr <= jahr) 
        {
            return jahr - geburtsjahr;
        }
        else 
        {
            System.out.println("Fehler: Ungueltiges Jahr " + jahr);
            return -1;
        }
    }
    
    public boolean istVolljaehrig() 
    {
        if (berechneAlter() >= 18) 
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public boolean istVolljaehrigImJahr(int jahr) 
    {
        return berechneAlterImJahr(jahr) >= 18;
    }
    
    public String generiereEmail() 
    {
        String kuerzel = nachname.substring(0, 2);
        if (nachname.length() > 2) 
        {
            kuerzel += nachname.charAt(2);
        }
        else 
        {
            kuerzel += vorname.charAt(0);
        }
        
        Random rnd = new Random(); // 10000 99999
        int zz = 10000 + rnd.nextInt(90000);
        
        return kuerzel.toLowerCase() + zz + "@spengergasse.at";
        
    }
    
    public String toString() 
    {
        if (inskribiert) 
        {
            return "Student " + vorname + " " + nachname + " (" + geschlecht + "), Jahrgang " + geburtsjahr + ", inskribiert";
        } 
        else 
        {
            return "Student " + vorname + " " + nachname + " (" + geschlecht + "), Jahrgang " + geburtsjahr + ", exmatrikuliert";
        }
        
    }
    
    public void print() 
    {
        System.out.println(toString());
    }
    
}
