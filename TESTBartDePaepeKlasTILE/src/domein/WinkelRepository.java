package domein;

import java.util.Arrays;
import java.util.List;

import persistentie.WinkelMapper;

public class WinkelRepository {
	private Winkel[] winkels;
	private WinkelMapper winkelMapper;
	
	public WinkelRepository() {
		// lees winkels uit bestand
		winkelMapper.leesTekstBestandWinkels("winkels_in.txt");
	}
	
	public Winkel geefWinkel(String naamWinkel) {
		
		
		for(Winkel eenWinkel: winkels) {
			if(eenWinkel.getNaam()==naamWinkel) {
				return eenWinkel;
				
			}
		}
		return null;
	}
	
	public List<Winkel> getWinkels(){
		return (Arrays.asList(winkels));
	}
	
	public void serialiseerWinkels(String naamBestand) {
		
	}
	
	

}
