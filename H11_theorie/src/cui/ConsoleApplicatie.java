package cui;

import java.util.NoSuchElementException;
import java.util.Scanner;

import domein.MijnGetal;

public class ConsoleApplicatie {
	Scanner input = new Scanner(System.in);
	String invoer;
	String [] gesplit;
	public ConsoleApplicatie() {
		boolean magStoppen = true;
		do {
			try {
				System.out.print("Geef twee gehele positieve getallen in gescheiden door een spatie: ");
				invoer = input.next();
				if(invoer == null || invoer.trim().isEmpty()) {
					throw new IllegalArgumentException("mag niet leeg zijn");
				}
				gesplit = this.splitit(invoer);
				int teller = 1;
				for(String eenDeel: gesplit) {
					MijnGetal mg = new MijnGetal(Integer.parseInt(eenDeel));
					System.out.printf("res%d = %d%n", teller, mg.geefVierkantswortel());
					teller++;
				}
				
			}
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}while(!magStoppen);
	}
	
	private String [] splitit(String splitme) throws NoSuchElementException {
		//int[] gesplit = new int[2];
		String[] gesplit = splitme.split(" ");
		if(gesplit.length != 2) {
			throw new NoSuchElementException("moet 2 ints bevatten gescheiden door spatie");
		}
		return gesplit;
	}

}
