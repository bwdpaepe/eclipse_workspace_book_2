package ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
		List<String> list = new ArrayList<String>();
		for(String color: colors) {
			list.add(color);
		}
		
		String[] removeColors = {"RED", "WHITE", "BLUE"};
		List<String> removeList = new ArrayList<String>();
		for(String removeColor: removeColors) {
			list.add(removeColor);
		}
		
		// output  list contents
		for(int count = 0; count < list.size(); count++) {
			System.out.printf("%s ", list.get(count));
		}
		
		//
		removeColors(list, removeList);
		

	}
	
	private static void removeColors(Collection<String> collection1,Collection<String> collection2) {
		Iterator<String> iterator = collection1.iterator();
		
		while(iterator.hasNext()) {
			if(collection2.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}

}
