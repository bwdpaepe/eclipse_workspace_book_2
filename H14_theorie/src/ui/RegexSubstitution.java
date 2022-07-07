package ui;

import java.util.Arrays;

public class RegexSubstitution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstString = "This sentence ends in 5 stars *****";
		String secondString = "1, 2, 3, 4, 5, 6, 7, 8";
		firstString = firstString.replaceAll("\\*", "^");
		firstString = firstString.replaceAll("stars", "carets");
		System.out.printf("%s%n", firstString.replaceAll("\\w+", "word"));
		
		for(int i = 0; i<3; i++) {
			secondString = secondString.replaceFirst("\\d", "digit");
			
		}
		
		String[] results = secondString.split(",\\s*");
		System.out.println(Arrays.toString(results));

	}

}
