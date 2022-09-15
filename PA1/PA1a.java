import java.util.Scanner;

public class PA1a 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter the number of yards: ");
		int numYards = input.nextInt();
		
		System.out.print("Enter the number of feet: ");
		int numFeet = input.nextInt();
		
		System.out.print("Enter the number of inches: ");
		int numInches = input.nextInt();
		
		int totalInches = (numYards * 36) + (numFeet * 12) + numInches;
		
		System.out.printf("Total number of inches: %d", totalInches);
	}
}
