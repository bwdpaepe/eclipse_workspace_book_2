package ui;

import java.util.Arrays;
import java.util.LinkedList;

public class ToArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors = {"black", "blue", "yellow"};
		LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
		
		
		links.addLast("red");
		links.add("pink");
		links.add(3, "green");
		links.addFirst("cyan");
		
		colors = links.toArray(new String[links.size()]);
		
		
	}

}
