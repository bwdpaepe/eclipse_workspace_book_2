package persistentie;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadBinaryFile {
	
	private ObjectInputStream input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			input = new ObjectInputStream(Files.newInputStream(Paths.get("src\\bestanden\\accounts.ser")));
		}
		catch(InvalidPathException ie) {
			System.err.println("Error finding file");
			System.exit(1);
		}
		catch(IOExeption io) {
			System.err.println("Error opening file.")
			System.exit(1);
		}

	}

}
