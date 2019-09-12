import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

public class Order {
	
	public static String cleanSelections = "";

	public static void main(String[] args) {
		
		Scanner myObj2 = new Scanner(System.in);

		
		ArrayList<String> orderSelection  = new ArrayList<String>();
		ArrayList<Double> orderTotal2 = new ArrayList<Double>();
		
		double tax = .05,
			   burger = 4.50, 
			   drink = 1.50, 
			   fries = 2.50, 
			   dessert = 3.00, 
			   delivery = 5.00, 
			   extraDelivery = 7.00,
			   orderTotal = 0.00;
		
		System.out.println("Here's a list of available items\n"
				+ "Burger: $4.50 \n"
				+ "Fries: $2.50 \n"
				+ "Drink: $1.50 \n"
				+ "Dessert: $3.00 ");
		
		
		for (var x = 0; x < Main.items; x ++) {
			
			System.out.println("What would you like for item " + (x + 1) + "?");
			orderSelection.add(myObj2.nextLine().toLowerCase());
			
			switch(orderSelection.get(x)) {
			case "burger":
				orderTotal2.add(burger + (burger * tax));
				break;
			case "drink":
				orderTotal2.add(drink + (drink * tax));
				break;
			case "fries":
				orderTotal2.add(fries + (fries * tax));
				break;
			case "dessert":
				orderTotal2.add(dessert + (dessert * tax));
				break;
			default:
				System.out.println("Invalid Input");
				Main.main(args);	
			}
		}
		
		double sum = 0;
		for (Double y : orderTotal2) 
			sum += y;
			sum = Math.round(sum * 100.0) / 100.0;
			
			cleanSelections = Arrays.toString(orderSelection.toArray()).replace("[", "").replace("]", "");
		
		
		if (Main.orderType.equals("delivery")) {
			
			if (Main.zipCode < Delivery.maxZipValueAvail && Main.zipCode > Delivery.minZipValueAvail) {
				
				sum += delivery;
				System.out.println("Your delivery total is " + "$" + sum + 
						           "\nThank you for your order. "
						           + "\nYou have ordered the following: " + cleanSelections);
				
			} else if(Main.zipCode >= (Delivery.restaurantZipCode + 5) || Main.zipCode <= (Delivery.restaurantZipCode - 5)) {
					
				sum += extraDelivery;
				System.out.println("Your extra charge delivery total is " + "$" + sum + 
						           "\nThank you for your order. "
						           + "\nYou have ordered the following: " + cleanSelections);

			} else {

				System.out.println("Delivery is not Available");		
			}
				
		} else {

				System.out.println("Your pickup total is " + "$" + sum + 
						          "\nThank you for your order. "
						          + "\nYou have ordered the following: " + cleanSelections);
		}
		
		
		
		

	}

}
