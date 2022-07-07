package ui;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
		
		System.out.printf("o strings: %s%n", Arrays.asList(strings));
		
		//uppercase
		System.out.printf("u strings: %s%n", Arrays.stream(strings)
				                                   .map(String::toUpperCase)
				                                   .collect(Collectors.toList()));
		//less than 'n' (case insensitive) sorted ascending
		System.out.printf("strings less than n sorted ascending: %s%n", Arrays.stream(strings)
				                                                              .filter(s->s.compareToIgnoreCase("n")<0)
				                                                              .sorted(String.CASE_INSENSITIVE_ORDER)
				                                                              .collect(Collectors.toList()));
		//less than 'n' (case insensitive) sorted descending
		System.out.printf("strings less than n sorted ascending: %s%n", Arrays.stream(strings)
				                                                              .filter(s->s.compareToIgnoreCase("n")<0)
				                                                              .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
				                                                              .collect(Collectors.toList()));
		

	}

}
