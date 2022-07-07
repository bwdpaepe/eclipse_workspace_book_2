package persistentie;

import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateBinaryFile {
	
	private ObjectOutputStream output;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			output = new ObjectOutputStream(Files.newOutputStream(Paths.get("src\\bestanden\\accounts.ser")));
		}
		catch(InvalidPathException ie) {
			System.err.println("Error finding file");
			System.exit(1);
		}
		catch(IOException ex) {
			System.err.println("Error opening file");
			System.exit(1);
		}

	}

}
