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
import java.util.ArrayList;

public class WeightedAverage {

	public static void main(String[] args) {
		
		//Setting up scanner and data types
		Scanner myObj = new Scanner(System.in);
		int setNumber[] = new int[7],
			sets, pairs, i, x, y;
		double setMultiplier[] = new double[7],  
			   multipliedResult[] = new double[7], 
			   masterAverage, sum;
		ArrayList<Double> weightedAverage = new ArrayList<Double>();

		//Figuring out how many sets of numbers and how many pairs should be housed in each set
		System.out.println("How many sets of numbers?");
		sets = myObj.nextInt();
		
		System.out.println("How many pairs in each set?");
		pairs = myObj.nextInt();
		
		//Loop for sets
		for (x = 1; x <= sets; x++) {
			
			//Loop for pairs and gathering number and multiplier inputs
			for (i = 1; i <= pairs; i++) {
				System.out.println("Enter set " + x + " number for pair " + i + ":");
				setNumber[i] = myObj.nextInt();
			
				System.out.println("Enter set " + x + " multiplier for pair " + i + ":");
				setMultiplier[i] = myObj.nextDouble();
			
				//getting multiplied value for each pair
				multipliedResult[i] = setNumber[i] * setMultiplier[i];
			}

			//Adding up all of the array values
			weightedAverage.add(Arrays.stream(multipliedResult).sum());
		}
		
		//finding sum of weighted averages and printing out weighted average for each set
		sum = 0;
		for(y = 0; y < weightedAverage.size(); y++) {
			sum += weightedAverage.get(y);
			
			System.out.println("Your set " + (y+1) + " Weighted Average is " + weightedAverage.get(y)   
					+ ".");
		}
		
		
		
		masterAverage = sum / weightedAverage.size();
		System.out.println("Your Master Average is " + masterAverage
			+ ".");
	}}