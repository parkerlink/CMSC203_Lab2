import java.util.Scanner;

public class Link_Parker_Lab2 {

	public static void main(String[] args) {
		//TASK #2 Create a Scanner object here 
		Scanner scanner = new Scanner(System.in); 
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		double userTemperature;//Task #2 declare a variable to hold the user’s temperature
		
		System.out.print("What is the first score: "); //Task #2 prompt user to input score1
		score1 = scanner.nextInt(); //Task #2 read score1 
		
		System.out.print("What is the second score: ");//Task #2 prompt user to input score2
		score2 = scanner.nextInt(); //Task #2 read score2 
		
		// Find an arithmetic average
		average = (score1 + score2 ) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (double) 5/9 * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		System.out.print("What is the user's temperature: ");//Task #2 prompt user to input another temperature
		userTemperature = scanner.nextDouble();//Task #2 read the user’s temperature in Fahrenheit
		fToC = (double) 5/9 * (userTemperature - 32);//Task #2 convert the user’s temperature to Celsius
		output = userTemperature + " in Fahrenheit is " + fToC + " in Celsius."; //Task #2 print the user’s temperature in Celsius
		System.out.println(output);
		
		System.out.println("Thanks for using the program, have a great day!"); // to show that the program is ended	

	}

}
