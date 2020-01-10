package wellOfIdeas;

import java.util.Scanner;

public class Kata {
	
	public static String well(String[] x) {
		
		int count = 0;
		
		for(String word: x) {
			if(word.equals("good")) {
				count++;
			}
		}
		
		if (count == 1 || count == 2) {
			
			return "Publish";
			
		} else if (count > 2) {
			
			return "I smell a series!";
		
		} else {
			
			return "Fail!";
			
		}
		
		
		
	}

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		String[] myString;
		
		Scanner scan = new Scanner(System.in);
		myString = scan.nextLine();
		
		System.out.println(well(myString));

	}
	
	

}
