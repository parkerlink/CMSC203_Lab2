import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {

		System.out.println("This program calculates the volume of a sphere"); //Print the purpose of the program
		double diam;
		double radius;
		double volume;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the diameter of the sphere: "); // Print a prompt asking for the diameter of a sphere 
		diam = scan.nextDouble(); // Read the diameter 
		
		radius = diam/2; // Calculate the radius as diameter divided by 2 
		volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3); // Calculate volume of the sphere using the formula 
		
		System.out.println("A sphere with a diameter of " + diam + " has a total volume of " + volume); // Print the volume 
	}

}
