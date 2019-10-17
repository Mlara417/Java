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
			
			Calculations.main(response);

			} else if (response.equals("i")) {
				
				Calculations.main(response);

			} else if (response.equals("r")) {
				
				Calculations.main(response);

			} else {
			System.out.print("That is not a valid response\n");
			System.out.println ();
			main.main(args);
			} 
	}

}

/*DEMONSTRATION 
 * 
 * In my demonstration, I showed how to access the debug perspective. From the debug perspective, you can then 
 * use the breakpoints by clicking on the sidebar twice to inspect the program at any necessary point. 
 * I then stepped over each line and the step into / return icons were right next to those. On the right hand
 * side, you have a variables window that makes debugging variables a breeze.
 * 
 * https://cl.ly/d61fbe
 * */


/* ISSUE 1: in the core if/elseif/elseif/else statement, I used response == ""
 * instead of response.equals. It's different when comparing strings and int
 * 
 * Here's a video I used to debug this. As I was stepping over, I noticed the response variable had the data I 
 * was adding in the input. That made me realize that the conditions in my else statements weren't working 
 * since the data was being passed but my desired actions were being skipped. 
 * https://cl.ly/565db9 */