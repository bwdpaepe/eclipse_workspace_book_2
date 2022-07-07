package persistentie;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import domein.BadkamerWinkel;
import domein.Classificatie;
import domein.KeukenWinkel;
import domein.Winkel;

public class WinkelMapper {
	private Scanner leesBestand;
	private ObjectOutputStream schrijfBestand;
	
	//scan
	public List<Winkel> leesTekstBestandWinkels(String naamBestand){
		try {
			leesBestand = new Scanner(Files.newInputStream(Paths.get("src\\bestanden\\naamBestand.txt")));
		}
		catch(InvalidPathException ie) {
			System.err.println("Error finding file.");
			System.exit(1);
		}
		catch(IOException ex) {
			System.err.println("Error opening file");
			System.exit(1);
		} 
		
		List<Winkel> lijst = new ArrayList<>();
		String leesRecord;
		String[] leesArray;
		
		try {
			while(leesBestand.hasNext()) {
				leesRecord = leesBestand.nextLine();
				leesArray = leesRecord.split("-");
				if(leesArray.length != 6) {
					throw new IllegalArgumentException("er moeten 6 velden aanwezig zijn per record, dat was niet het geval, record overgeslaan");
				}
				switch(leesArray[0].charAt(0)) {
					case 'b': lijst.add(new BadkamerWinkel(leesArray[1],leesArray[2],leesArray[3],Integer.parseInt(leesArray[4]),Classificatie.leesArray[5]);
					          break;
					case 'k': lijst.add(new KeukenWinkel(leesArray[1],leesArray[2],leesArray[3],Integer.parseInt(leesArray[4]),Classificatie.leesArray[5]);
							  break;
				}
				
			}
		}
		catch(IllegalArgumentException elementException) {
			System.err.println(elementException);
		
		}
		catch(InputMismatchException elementException) {
			System.err.println("File improperly formed");
			leesBestand.close();
			System.exit(1);
		}
		catch(NoSuchElementException elementException) {
			System.err.println("Element missing");
			leesBestand.close();
			System.exit(1);
		}
		catch(IllegalStateException stateException) {
			System.err.println("Error reading from file");
			System.exit(1);
		}
		return lijst;
				
				
	}
	
	//format
	
	public void serialiseerWinkels(List<Winkel> listWinkels, String naamBestand) {
		try {
			schrijfBestand = new ObjectOutPutStream(Files.newOutputStream(Paths.get(String.format("src\\bestanden\\%s",naamBestand))));
		}
		catch(InvalidPathException ie) {
			System.err.println("Error finding file");
			System.exit(1);
		}
		catch(IOException ex) {
			System.err.println("Error creating file");
			System.exit(1);
		}
		
		for(Winkel eenWinkel: listWinkels) {
			try {
				schrijfBestand.writeObject(eenWinkel);
			}
			catch(IOException ex) {
				System.err.println("Error writing to file");
			}
		}
		
		
		
	}
	
	

}
