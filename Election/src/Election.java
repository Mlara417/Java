// ************************************************************
// Election.java
//
// This file contains a program that tallies the results of
// an election. It reads in the number of votes for each of
// two candidates in each of several precincts. It determines
// the total number of votes received by each candidate, the
// percent of votes received by each candidate, the number of
// precincts each candidate carries, and the
// maximum winning margin in a precinct.
// ************************************************************
import java.util.Scanner;
public class Election
{ public static void main (String[] args)
{
int votesForPolly; // number of votes for Polly in each precinct
int votesForErnest; // number of votes for Ernest in each precinct
int totalPolly; // running total of votes for Polly
int totalErnest; // running total of votes for Ernest
int pollyPrecinctWon;
int ernestPrecinctWon;
int precinctsTied;
int i;

double ernestPercentage;
double pollyPercentage;
double total;
String response = "y"; // answer (y or n) to the "more precincts" question

Scanner scan = new Scanner(System.in);
System.out.println ();
System.out.println ("Election Day Vote Counting Program");
System.out.println ();

// Initializations
i = 1; 
votesForPolly = 0;
votesForErnest = 0;
totalPolly = 0;
totalErnest = 0;
total = 0;
pollyPrecinctWon = 0;
ernestPrecinctWon = 0;
precinctsTied = 0;

// Loop to "process" the votes in each precinct
while (response.equals("y")) {
	
	
	System.out.println ("How many votes for Polly in precinct " + i + " ?");
	votesForPolly = scan.nextInt();
	totalPolly += votesForPolly;

	System.out.println ("How many votes for Ernest in precinct " + i + " ?");
	votesForErnest = scan.nextInt();
	totalErnest += votesForErnest;
	
	System.out.println ("Would you like to add another precinct? (y or n)");
	response = scan.next();
	
	i++;
	
	if (votesForErnest > votesForPolly) {
		
		ernestPrecinctWon++;
		System.out.println ("Ernest Has Won This Precinct!\n");
		
	}
	else if (votesForErnest < votesForPolly) {
		
		pollyPrecinctWon++;
		System.out.println ("Polly Has Won This Precinct!\n");
		
	} else {
		
		precinctsTied++;
		System.out.println ("The candidates have tied for this precinct!\n");
		
	}
	
	
}


// Print out the results
total = totalPolly + totalErnest;
ernestPercentage = (totalErnest / total) * 100;
pollyPercentage = (totalPolly / total) * 100;

System.out.println ("Total votes for Ernest are: " + totalErnest);
System.out.println ("Percentage of the votes for Ernest are: " + ernestPercentage + "%" );
System.out.println ("Ernest has won " + ernestPrecinctWon + " precincts.\n" );

System.out.println ("Total votes for Polly are: " + totalPolly);
System.out.println ("Percentage of the votes for Ernest are: " + pollyPercentage + "%" );
System.out.println ("Polly has won " + pollyPrecinctWon + " precincts.\n" );




}
} 