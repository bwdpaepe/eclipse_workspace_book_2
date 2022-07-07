package ui;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors = {"red", "white", "blue", "green", "gray", 
				"orange", "tan", "white", "cyan", "peach", "gray", "orange"};
		//List<String> list = Arrays.asList(colors);
		SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));
		printSet(tree);
		
		printSet(tree.headSet("orange"));
		
		printSet(tree.tailSet("orange"));
		
		System.out.printf("first: %s%n", tree.first());
		System.out.printf("last: %s%n", tree.last());
		
	}
	
	private static void printSet(SortedSet<String> set) {
		for(String v: set) {
			System.out.printf("%s ", v);
		}
		System.out.println();
	}

}
