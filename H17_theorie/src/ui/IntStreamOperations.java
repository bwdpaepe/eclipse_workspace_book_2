package ui;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
		
		System.out.println(
				IntStream.of(values)
				         .mapToObj(String::valueOf)
				         .collect(Collectors.joining(" ")));
		
		System.out.printf("%nCount: %d%n", IntStream.of(values).count());
		System.out.printf("Min: %d%n", IntStream.of(values)
				                                .min()
				                                .getAsInt());
		System.out.printf("Max: %d%n", IntStream.of(values)
                								.max()
                								.getAsInt());
		System.out.printf("Average: %.2f%n", IntStream.of(values)
													  .average()
													  .getAsDouble());
		System.out.printf("Sum: %d%n", IntStream.of(values)
                								.reduce(0,(x,y) -> x + y));
		System.out.printf("Product: %d%n", IntStream.of(values)
                									.reduce((x,y) -> x*y)
                									.getAsInt());
		System.out.printf("Sum of squares: %d%n", IntStream.of(values)
                										   .map((x) -> {return ((int)Math.pow(x,2));})
                										   .sum());
		System.out.printf("Sorted: %s%n", IntStream.of(values)
                								   .sorted()
                								   .mapToObj(String::valueOf)
                								   .collect(Collectors.joining(" ")));                

	}

}
