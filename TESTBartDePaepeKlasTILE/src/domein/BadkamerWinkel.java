package domein;

import java.util.ArrayList;
import java.util.List;

public class BadkamerWinkel extends Winkel {
	
	private List<DoucheBak> voorraad;

	public BadkamerWinkel(String naam, String vestigingsplaats, String sector, int omzet, Classificatie classificatie) {
		this(naam,vestigingsplaats,sector,omzet,classificatie, new ArrayList<DoucheBak>());
		
	}
	
	public BadkamerWinkel(String naam, String vestigingsplaats, String sector, int omzet, Classificatie classificatie, List<DoucheBak> voorraad) {
		super(naam, vestigingsplaats,sector,omzet,classificatie);
		this.setVoorraad(voorraad);
		
	}
	
	

	public List<DoucheBak> getVoorraad() {
		return voorraad;
	}

	private void setVoorraad(List<DoucheBak> voorraad) {
		this.voorraad = voorraad;
	}
	
	public DoucheBak[] geefDoucheBakkenMetLengteEnBreedteEnMateriaal(int deLengte, int deBreedte, String hetMateriaal) {
		List<DoucheBak> lengteEnBreedteOKList = new ArrayList<>();
		for(DoucheBak stuk: voorraad) {
			if(stuk.getLengte() >= deLengte && stuk.getBreedte() >= deBreedte) {
				lengteEnBreedteOKList.add(stuk);
			}
		}
		return lengteEnBreedteOKList.toArray(new DoucheBak[lengteEnBreedteOKList.size()]);
	}
	
	

	@Override
	public String toString() {
		String output;
		String doucheBakString="";
		int counter = 1;
		for(DoucheBak stuk: voorraad) {
			doucheBakString += String.format("%s %d: %s%n", stuk.getClass().getSimpleName(), counter, stuk.toString());
			counter++;		
		}
		output = String.format("[%s%n%s]", super.toString(),doucheBakString);
		return output;
	}
	
	public void voegDoucheBakAanVoorraadToe(DoucheBak doucheBak) {
		voorraad.add(doucheBak);
	}

	@Override
	public double geefJaarlijkseBelasting() {
		// TODO Auto-generated method stub
		return (super.getOmzet() * 0.25);
	}

}
