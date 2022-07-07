package ui;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom randomNum = new SecureRandom();
		
		System.out.println("Random numbers on sep lines:");
		randomNum.ints(10,1,7)
		         .forEach(System.out::println);
		         //.forEach((x) -> System.out.println(x));
		
		String numbers =
				randomNum.ints(10,1,7)
				         .mapToObj(String::valueOf)
				         .collect(Collectors.joining(" "));
		
		System.out.printf("%s%n", numbers);

	}

}
