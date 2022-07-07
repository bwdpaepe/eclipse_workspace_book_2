package ui;

import java.util.stream.IntStream;

public class StreamFilterMapReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("sum of triples of even from 2 through 10 is: %d%n",
				IntStream.rangeClosed(1, 10)
				         .filter((x) -> {return x%2 ==0;})
				         .map((x) -> {return x*3;})
				         .sum());

	}

}
