package domein;

public class Thermometer1
{
    private int aantalGraden;

    public int getAantalGraden()
    {
        return aantalGraden;
    }

    private void setAantalGraden(int aantalGraden)
    {
        this.aantalGraden = aantalGraden;
    }

    public Thermometer1()
    {
        this(32);
    }

    public Thermometer1(int aantalGraden)
    {
        setAantalGraden(aantalGraden);
    }
    
    public int converteerNaarCelcius()
    {
        return (aantalGraden - 32) * 5 / 9;
    }
}
