package ui;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Number> stack = new ArrayDeque<>();
		Long longNum = 12L;
		Integer intNum = 34456;
		Float floatNum = 1.0F;
		Double doubleNum = 1234.5678;
		
		stack.push(longNum);
		printStack(stack);
		stack.push(intNum);
		printStack(stack);
		stack.push(floatNum);
		printStack(stack);
		stack.push(doubleNum);
		printStack(stack);
		
		try {
			Number removedObject = null;
			while(true) {
				removedObject = stack.pop();
				System.out.printf("%s popped%n", removedObject);
				printStack(stack);
			}
		}
		catch(NoSuchElementException noSuchElementException) {
			noSuchElementException.printStackTrace();
		}
		

	}
	
	private static void printStack(Deque<Number> stack) {
		if(stack.isEmpty()) {
			System.out.println("stack is leeg");
		}
		else {
			System.out.print("stack bevat: ");
			for(Number num: stack) {
				System.out.printf("%s ",num);
			}
			System.out.print("(top) \n\n");
		}
		
	}

}
