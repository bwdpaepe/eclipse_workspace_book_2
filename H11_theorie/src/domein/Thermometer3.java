package domein;

public class Thermometer3 {
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

    public Thermometer3()
    {
        this(32);
    }

    public Thermometer3(int aantalGraden)
    {
        setAantalGraden(aantalGraden);
    }
    
    public int converteerNaarCelcius()
    {
        return (aantalGraden - 32) * 5 / 9;
    }
    
    public void stelAantalGradenIn(String invoer) {
    	int graden = Integer.parseInt(invoer);
    	setAantalGraden(graden);
    }
}
