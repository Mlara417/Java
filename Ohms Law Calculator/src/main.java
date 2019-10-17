public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int voltage;
		int current;
		int resistance;
		
		System.out.println ();
		System.out.println ("Ohms Law Calculator Program");
		System.out.println ();
		
		String response = TypeSelector.main(args);
		
	
		if (response.equals("v")) {
			System.out.print("v");
			
		} else if (response.equals("i")) {
			System.out.print("i");
			
		} else if (response.equals("r")) {
			System.out.print("r");
			
		} else {
			System.out.print("That is not a valid response\n");
			System.out.println ();
			main.main(args);
		}
		
	}

}

/* ISSUE 1: in the core if/elseif/elseif/else statement, I used response == ""
 * instead of response.equals. It's different when comparing strings and int*/
