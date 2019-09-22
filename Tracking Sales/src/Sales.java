// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;
public class Sales {
	public static void main(String[] args)
	{
		int SALESPEOPLE;
		int[] sales;
		int comparisonValue;
		int max;
		int min;
		int maxSalesperson;
		int minSalesperson;
		double sum;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many salespeople are there?");
		SALESPEOPLE = scan.nextInt();
		sales = new int[SALESPEOPLE];
		
		for (int i=0; i<sales.length; i++) {
			System.out.print("Enter sales for salesperson " + (i+1) + ": ");
			sales[i] = scan.nextInt();
			}
		System.out.println("\nSalesperson  Sales");
		System.out.println(" ------------------ "); 
		
		sum = 0;
		min = sales[0];
		max = sales[0];
		maxSalesperson = 0;
		minSalesperson = 0+1;
		
		for (int i=0; i<sales.length; i++) {
			System.out.println("     " + (i+1) + "         " + sales[i]);
			sum += sales[i];

			if(sales[i] > max) {
				max = sales[i];
				maxSalesperson = i+1;
			} 
			
			if(sales[i] < min) {
				min = sales[i];
				minSalesperson = i+1;
			} 
			
			
			
			}
		
		System.out.println("\nTotal sales: " + sum);
		System.out.println("\nAverage Sale: " + sum/sales.length);
		System.out.println("\nSalesperson " + maxSalesperson + " had the highest sale with $" + max);
		System.out.println("\nSalesperson " + minSalesperson + " had the lowest sale with $" + min);
		
		System.out.print("Enter a comparison value:\n");
		comparisonValue = scan.nextInt();
		
		System.out.print("The following have exceeded the comparison value:\n");
		for (int i=0; i<sales.length; i++) {
			if (sales[i] > comparisonValue) {
				System.out.println("Salesperson: " + (i+1) + ", Amount of Sales: " + sales[i] + ";");
				
			}
		}
	}
}
