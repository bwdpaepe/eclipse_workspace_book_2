package domein;

import exceptions.SectorMisMatchException;

public class Winkel implements TeBetalenBelasting {
	
	private String naam;
	private String vestigingsplaats;
	private String sector;
	private int omzet;
	private Classificatie classificatie;
	
	public Winkel(String naam, String vestigingsplaats, String sector, int omzet) {
		this(naam,vestigingsplaats,sector,omzet,Classificatie.KLEIN);
	}
	
	public Winkel(String naam, String vestigingsplaats, String sector, int omzet, Classificatie classificatie) {
		this.setNaam(naam);
		this.setVestigingsplaats(vestigingsplaats);
		try {
			this.setSector(sector);
		} catch (SectorMisMatchException e) {
			// TODO Auto-generated catch block
			System.err.printf("%s%n",e.getMessage());
		}
		this.setOmzet(omzet);
		this.setClassificatie(classificatie);
		
	}
	
	

	public String getNaam() {
		return naam;
	}

	private void setNaam(String naam) {
		if(naam == null || naam.isEmpty()) {
			throw new IllegalArgumentException("naam mag niet leeg zijn");
		}
		this.naam = naam;
	}

	public String getVestigingsplaats() {
		return vestigingsplaats;
	}

	private void setVestigingsplaats(String vestigingsplaats) {
		this.vestigingsplaats = vestigingsplaats;
	}

	public String getSector() {
		return sector;
	}

	private void setSector(String sector) throws SectorMisMatchException {
		if(sector == null || sector.isEmpty() || !(sector.matches("[A-Z]{3}[0-9]{4}") || (sector.matches("[a-z]{5}\\d{2,}")))) {
			throw new SectorMisMatchException("sector fout geformateerd");
		}
		this.sector = sector;
	}

	public int getOmzet() {
		return omzet;
	}

	private void setOmzet(int omzet) {
		this.omzet = omzet;
	}
	
	public Classificatie getClassificatie() {
		return classificatie;
	}

	private void setClassificatie(Classificatie classificatie) {
		this.classificatie = classificatie;
	}
	
	@Override
	public String toString() {
		String output;
		output = String.format("%s %s, in %s, sector = %s, omzet = %d%n", this.getClass().getSimpleName(), this.getNaam(), this.getVestigingsplaats(), this.getSector(), this.getOmzet());
		return output;
	}

	
	@Override
	public double geefJaarlijkseBelasting() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
