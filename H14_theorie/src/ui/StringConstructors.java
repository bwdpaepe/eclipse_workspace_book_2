package ui;

public class StringConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] charArray = {'a', 'b', 'c'};
		String s = new String("hello");
		
		String s1 = new String();
		String s2 = new String(s);
		String s3 = new String(charArray);
		String s4 = new String(charArray, 1, 1);
		
		String s5 = "hello there";
		System.out.printf("length: %d", s5.length());
		
		System.out.printf("%c",  s5.charAt(1));
		
		char [] charArray2 = new char[5];
		
		s5.getChars(0, 5, charArray2, 0);
		
		String s11 = new String("hello");
		String s12 = "goodbye";
		String s13 = "Happy Birthday";
		String s14 = "happy birthday";
		
		boolean b1 = s11.equals("hello");
		boolean b2 = (s11 == "hello");
		boolean b3 = s13.equalsIgnoreCase(s14);
		System.out.printf("%ns11.compareTo(s12) is %d", s11.compareTo(s12));
		if(s13.regionMatches(0, s14, 0, 5)) {
			System.out.println("First 5 characters of s3 and s4 match");
		}
		
		String s21 = "started";
		if(s21.startsWith("st")) {
			System.out.printf("\"%s\" starts with \"st\"%n", s21);
		}
		
		System.out.printf("'t' is located at index %d%n", s21.indexOf('t'));
		System.out.printf("last 't' is located at index %d%n", s21.lastIndexOf('t'));
		
		String letters = "abcdefghijklmnopqrstuv";
		System.out.printf("Substring from .. \"%s\"%n", letters.substring(15));
		System.out.printf("Substring from ..till \"%s\"%n", letters.substring(15,18));
		String s31 = "Happy";
		String s32 = "Birthday";
		System.out.printf("during concat %s%n",s31.concat(s32));
		System.out.printf("after concat %s%n",s31);
		
		char [] charArray3 = {'a','b','c'};
		boolean booleanValue = true;
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 1000000L;
		float floatValue = 2.5f;
		double doubleValue = 33.33;
		Object objectRef = "hello";
		
		System.out.printf("char array %s%n", String.valueOf(charArray));
		System.out.printf("boolean = %s%n", String.valueOf(booleanValue));
		
		
		

	}

}
