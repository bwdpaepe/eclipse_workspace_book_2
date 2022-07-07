package domein;

public class Thermometer2 {
	private int aantalGraden;

    public int getAantalGraden()
    {
        return aantalGraden;
    }

    private void setAantalGraden(int aantalGraden) throws IllegalArgumentException
    {
    	if (aantalGraden < 14 || aantalGraden > 104) {
        	throw new IllegalArgumentException("Waarde van temperatuur moet uit het interval [14,104] komen!");
        }
    	this.aantalGraden = aantalGraden;
    }

    public Thermometer2()
    {
        this(32);
    }

    public Thermometer2(int aantalGraden)
    {
        setAantalGraden(aantalGraden);
    }
    
    public int converteerNaarCelcius()
    {
        return (aantalGraden - 32) * 5 / 9;
    }
}
