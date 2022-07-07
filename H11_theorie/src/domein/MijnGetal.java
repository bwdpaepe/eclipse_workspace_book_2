package domein;

public class MijnGetal {
	
	private int getal;
	
	public MijnGetal(int getal) {
		this.setGetal(getal);
	}

	public int getGetal() {
		return getal;
	}

	private void setGetal(int getal) {
		this.getal = getal;
	}
	
	public int geefVierkantswortel() {
		return ((int)(Math.sqrt((double) this.getGetal())));
	}
	
	

}
