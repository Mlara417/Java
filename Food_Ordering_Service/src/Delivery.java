
class Delivery {
	
	public static int restaurantZipCode = 60446,
		              maxZipValueAvail = restaurantZipCode + 5,
		              minZipValueAvail = restaurantZipCode - 5;

	public static void main(String[] args) {
		
		
		
		
		if (Main.zipCode < maxZipValueAvail && Main.zipCode > minZipValueAvail) {

			System.out.println("Delivery is Available");
			
		} else if(Main.zipCode == maxZipValueAvail || Main.zipCode == minZipValueAvail) {

			System.out.println("Delivery is Available with Extra Cost");

		} else {

			System.out.println("Delivery is not Available");
			
		}

	}

}
