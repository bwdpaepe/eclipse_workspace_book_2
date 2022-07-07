package persistentie;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Formatter;

public class AccountRecordMapper {
	
	private Formatter output;
	private Scanner input;
	
	//format
	private void openFileWrite() {
		try {
			output = new Formatter(Files.newOutputStream(Paths.get("src\\bestanden\\clients.txt"), StandardOpenOption.APPEND));
		}
		catch(InvalidPathException ie) {
			System.err.println("Error finding file");
			System.exit(1);
		}
		catch(IOException ex) {
			System.err.println("Error creating file");
			System.exit(1);
		}
	}
	
	//scan
	private void openFileRead() {
		try {
			input = new Scanner(Files.newInputStream(Paths.get("src\\bestanden\\clients.txt")));
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
	
	
	//format2
	public void addRecord(AccountRecord record) {
		if(output == null) {
			openFileWrite();
		}
		try {
			output.format("%d %s %s %.2f%n", record.getAccount(, record.getFirstName(), record.getLastName(), record.getBalance()));
		}
		catch(FormatterClosedException formatterClosedException){
			System.err.println("Error writing to file");
		}
	}
	
	//scan2
	
	public List<AccountRecord> readRecords(){
		if(input==null) {
			openFileRead();
		}
		List<AccountRecord>lijst=new ArrayList<>();
		try {
			while(input.hasNext()) {
				lijst.add(new AccountRecord(input.nextInt(),input.next(),input.next(),input.nextDouble()));
			}
		}
		catch(InputMismatchException elementException) {
			System.err.println("File improperly formed");
			input.close();
			System.exit(1);
		}
		catch(NoSuchElementException elementException) {
			System.err.println("Element missing");
			input.close();
			System.exit(1);
		}
		catch(IllegalStateException stateException) {
			System.err.println("Error reading from file");
			System.exit(1);
		}
		return lijst;
	}
	
	public void closeFiles() {
		if(output != null) {
			output.close();
		}
		if(input != null) {
			input.close();
		}
	}

}
