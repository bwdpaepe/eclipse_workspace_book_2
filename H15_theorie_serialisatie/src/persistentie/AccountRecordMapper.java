package persistentie;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AccountRecordMapper {
	
	private ObjectOutputStream output;
	private ObjectInputStream input;
	
	private void openFileWrite() {
		try {
			output = new ObjectOutPutStream(Files.newOutputStream(Paths.get("src\\tekstbestanden\\tekstbestand.txt")));
		}
		catch(InvalidPathException ie) {
			System.err.println("Error finding file.");
			System.exit(1);
			
		}
		catch(IOException ex) {
			System.err.println("Error opening file");
			System.exit(1);
		}
	}
	
	private void openFileRead() {
		try {
			input = new ObjectInputStream(Files.newInputStream(Paths.get("src\\tekstbestanden\\tekstbestand.ser")));
		}
		catch(InvalidPathException ie) {
			System.err.println("Error finding file");
			System.exit(1);
		}
		catch(IOException io) {
			System.err.println("Error opening file");
			System.exit(1);
		}
		
	}
	
	public void addRecord(AccountRecord record) {
		if(output == null) {
			openFileWrite();
		}
		try {
			output.writeObject(record);
		}
		catch(IOException ex) {
			System.err.println("Error writing to file");
		}
		
	}
	
	public List<AccountRecord> readRecords(){
		
		if(input == null ) {
			openFileRead();
		}
		List<AccountRecord> lijst = new ArrayList<>();
		try {
			while(true) {
				AccountRecord record = (AccountRecord) input.readObject();
				lijst.add(record);
			}
		}
		catch(EOFException e) {
			
		}
		catch(ClassNotFoundException ex) {
			System.err.print("ongeldige objectstream");
			System.exit(1);
			
		}
		catch(IOException e) {
			System.err.println("Error reading file");
			System.exit(1);
		}
		return lijst;
	}
	
	public void closeFile() {
		if(output!=null) {
			try {
				output.close();
			}
			catch(IOException ex) {
				System.exit(1);
			}
		}
		if(input!=null) {
			try {
				input.close();
			}
			catch(IOException ex) {
				System.exit(1);
			}
		}
	}

}
