package ui;

import java.util.Scanner;

public class StaticCharMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		char c = input.charAt(0);
		
		System.out.printf("is def: %b%n", Character.isDefined(c));
		
		// digit to character;
		char output = Character.forDigit(10, 16);
		System.out.printf("%s%n", output);
		
		// character to digit
		int output2 = Character.digit('b', 16);
		System.out.printf("%s%n", output2);
		
	}

}
