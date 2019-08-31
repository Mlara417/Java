/* 
 * 
 * Moses Lara
 * Lewis University
 * 
 * 
 */

package weightedAverageCalculator;
import java.util.Arrays;
import java.util.Scanner;

public class WeightedAverage {

	public static void main(String[] args) {
		
		//Setting up scanner and data types
		Scanner myObj = new Scanner(System.in);
		int firstSetNumber[] = new int[7], 
			secondSetNumber[] = new int[7];
		double firstSetMultiplier[] = new double[7], 
			   secondSetMultiplier[] = new double[7], 
			   multipliedResult1[] = new double[7], 
			   multipliedResult2[] = new double[7],
			   weightedAverage1, weightedAverage2, masterAverage;
		
		//Finding first set of numbers, and multipliers and finding multiplied value
		for (int i = 1; i < 7; i++) {
			System.out.println("Enter first set number for pair " + i + ":");
			firstSetNumber[i] = myObj.nextInt();
			
			System.out.println("Enter first set multiplier for pair " + i + ":");
			firstSetMultiplier[i] = myObj.nextDouble();
			
			multipliedResult1[i] = firstSetNumber[i] * firstSetMultiplier[i];
			
		}
		
		//Finding first weighted average
		weightedAverage1 = Arrays.stream(multipliedResult1).sum();
		
		//Finding second set of numbers, and multipliers and finding multiplied value
		for (int i = 1; i < 7; i++) {
			System.out.println("Enter second set number for pair " + i + ":");
			secondSetNumber[i] = myObj.nextInt();
			
			System.out.println("Enter second set multiplier for pair " + i + ":");
			secondSetMultiplier[i] = myObj.nextDouble();
			
			multipliedResult2[i] = secondSetNumber[i] * secondSetMultiplier[i];
		}
		
		//Finding second weighted average
		weightedAverage2 = Arrays.stream(multipliedResult2).sum();
		
		//finding master average
		masterAverage = weightedAverage1 + weightedAverage2 / 2;
		
		//displaying results
		System.out.println("Your First Weighted Average is " + weightedAverage1
				+ ".");
		System.out.println("Your Second Weighted Average is " + weightedAverage2
				+ ".");
		System.out.println("Your Master Average is " + masterAverage
			+ ".");
		
	}

}
