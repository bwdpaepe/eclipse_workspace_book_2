package ui;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] values = {2,9,5,0,3,7,1,4,8,6};
		System.out.printf("o values: %s%n", Arrays.asList(values));
		//sorted
		System.out.printf("s values: %s%n", Arrays.stream(values)
				                                  .sorted()
				                                  .collect(Collectors.toList()));
		//>4
		List<Integer> greaterThan4 = Arrays.stream(values)
				                           .filter(x -> x > 4)
				                           .collect(Collectors.toList());
		//>4 and sorted
		List<Integer> greaterThan4andSorted = Arrays.stream(values)
                .filter(x -> x > 4)
                .sorted()
                .collect(Collectors.toList());
		
		
	}

}
