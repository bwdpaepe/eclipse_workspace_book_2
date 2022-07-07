package domein;

import java.util.List;

public class DomeinController {
	
	private WinkelRepository winkelRepository;
	
	public DomeinController() {
		this.winkelRepository = new WinkelRepository();
	}
	
	public String[] geefDouchebakkenMetLengteEnMateriaal(int lengte, int breedte, String materiaal, String naamWinkel) {
		if(this.winkelRepository.geefWinkel(naamWinkel)==null || naamWinkel.isEmpty()) {
			throw new IllegalArgumentException("naam is leeg of winkel bestaat niet");
		}
		Winkel winkel = this.winkelRepository.geefWinkel(naamWinkel);
		DoucheBak[] doucheBakArray = (((BadkamerWinkel) winkel).geefDoucheBakkenMetLengteEnBreedteEnMateriaal(lengte,breedte,materiaal));
		String [] output = new String[doucheBakArray.length];
		int counter=0;
		for(DoucheBak eenDoucheBak: doucheBakArray) {
			output[counter] = eenDoucheBak.toString();
			counter++;
		}
		return output;
	}
	
	public String[] geefNamenWinkels() {
		//return this.winkelRepository.
		
		List<Winkel> winkels = winkelRepository.getWinkels();
		String[] winkelNaamArray = new String[winkels.size()];
		int counter=0;
		for(Winkel eenWinkel: winkels) {
			winkelNaamArray[counter] = eenWinkel.getNaam();
			counter++;
		}
		return winkelNaamArray;
	}
	
	public void serialiseerWinkels() {
		winkelRepository.serialiseerWinkels("winkels_uit.ser");
	}

}
