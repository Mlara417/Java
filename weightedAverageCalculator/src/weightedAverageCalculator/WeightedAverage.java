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
			sets, pairs;
		double setMultiplier[] = new double[7],  
			   multipliedResult[] = new double[7], 
			   masterAverage;
		ArrayList<Double> weightedAverage = new ArrayList<Double>();
		
		System.out.println("How many sets of numbers?");
		sets = myObj.nextInt();
		
		System.out.println("How many pairs in each set?");
		pairs = myObj.nextInt();
		
		for (int x = 1; x <= sets; x++) {
			for (int i = 1; i <= pairs; i++) {
				System.out.println("Enter set " + x + " number for pair " + i + ":");
				setNumber[i] = myObj.nextInt();
			
				System.out.println("Enter set " + x + " multiplier for pair " + i + ":");
				setMultiplier[i] = myObj.nextDouble();
			
				multipliedResult[i] = setNumber[i] * setMultiplier[i];
			}

			weightedAverage.add(Arrays.stream(multipliedResult).sum());
		}
		
		//finding master average
		double sum = 0;
		for(int y = 0; y < weightedAverage.size(); y++) {
			sum += weightedAverage.get(y);
		}

		masterAverage = sum / weightedAverage.size();
		System.out.println("Your Weighted Averages are " + weightedAverage   
				+ ".");
		System.out.println("Your Master Average is " + masterAverage
			+ ".");
	}}