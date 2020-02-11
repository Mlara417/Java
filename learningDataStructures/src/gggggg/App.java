package gggggg;
import java.util.*;

public class App {

	public static void main(String[] args) {
		
		Stack theStack = new Stack(3);
			
		//theStack.push((char) 20);
		//theStack.push((char)40);
		//theStack.push((char)60);
		//theStack.push((char)80);
		
		/*while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}*/
			
		System.out.println(reverseString("Brittney"));

	}
	
	public static String reverseString(String str) {
		int stackSize = str.length(); // get max stack size
		Stack theStack = new Stack(stackSize); // we make the stack
		for(int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j); //getting a char from the input string
			theStack.push(ch);
		}
		
		String result = "";
		while(!theStack.isEmpty()) {
			char ch = theStack.pop();
			result = result + ch; //appending to the output
		}
		
		return result;
	}

}
