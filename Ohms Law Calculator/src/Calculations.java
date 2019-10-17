import java.util.Scanner;
public class Calculations {

	public static void main(String response) {
		
		// TODO Auto-generated method stub
		
		double voltage, current, resistance, amps, ohms, volts;
		
		Scanner scan = new Scanner(System.in);
		
		ohms = 0;
		amps = 0;
		volts = 0;
		
		
		
		
		if (response.equals("v")) {
			
			System.out.print("Please input the current(amps)");
			amps = scan.nextInt();
			System.out.print("Please input the resistance(ohms)");
			ohms = scan.nextInt();
			
			voltage = amps * ohms;
			System.out.print("The voltage is: " + voltage + " volts.");

			} else if (response.equals("i")) {
				System.out.print("Please input the voltage(volts)");
				volts = scan.nextInt();
				System.out.print("Please input the resistance(ohms)");
				ohms = scan.nextInt();
				
				current = volts / ohms;
				System.out.print("The amperage is: " + current + " amps.");

			} else if (response.equals("r")) {
				System.out.print("Please input the voltage(volts)");
				volts = scan.nextInt();
				System.out.print("Please input the current(amps)");
				amps = scan.nextInt();
				
				resistance = volts / amps;
				System.out.print("The resistance is: " + resistance + " ohms.");

			} else {
			System.out.print("That is not a valid response\n");
			System.out.println ();
			} 

	}

}
