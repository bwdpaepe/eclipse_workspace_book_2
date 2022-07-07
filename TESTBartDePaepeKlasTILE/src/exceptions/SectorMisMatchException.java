package exceptions;

public class SectorMisMatchException extends Exception {

	public SectorMisMatchException() {
		// TODO Auto-generated constructor stub
		this("sector mismatch! voer de sector correct in");
	}

	public SectorMisMatchException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	

}
