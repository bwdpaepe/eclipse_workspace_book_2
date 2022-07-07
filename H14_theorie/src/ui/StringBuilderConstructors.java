package ui;

public class StringBuilderConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder buffer1 = new StringBuilder();
		StringBuilder buffer2 = new StringBuilder(10);
		StringBuilder buffer3 = new StringBuilder("hello");
		
		System.out.printf("buffer3 = %s%n", buffer3);
		
		StringBuilder buffer4 = new StringBuilder("hello, how are you?");
		
		System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n", buffer4.toString(),buffer4.length(),buffer4.capacity());
		
		buffer4.ensureCapacity(75);
		
		buffer4.setLength(10);
		
		System.out.printf("char at.. %s%n", buffer4.charAt(4));
		char[] charArray1 = new char[buffer4.length()];
		buffer4.getChars(0, buffer4.length(), charArray1, 0);
		buffer4.setCharAt(1, 'H');
		buffer4.reverse();
		
		int integerValue = 7;
		
		buffer4.append(System.getProperty("line.separator"))
		       .append(integerValue);
		
		System.out.printf("contains: %s", buffer4.toString());
		
		StringBuilder buffer5 = new StringBuilder();
		Object objectRef = "hello";
		float floatValue = 2.5f;
		
		buffer5.insert(0, objectRef);
		buffer5.insert(0,  "  ");
		buffer5.insert(0, floatValue);
		System.out.printf("after inserts: %n%s%n", buffer5.toString());
		buffer5.deleteCharAt(5);
		System.out.printf("after deleteCharAt: %n%s%n", buffer5.toString());
		buffer5.delete(3, 5);
		System.out.printf("after delete: %n%s%n", buffer5.toString());
	}

}
