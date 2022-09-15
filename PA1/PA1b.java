import java.util.Scanner;

public class PA1b 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter number of inches: ");
		int numInches = input.nextInt();
		
		int numYards = numInches/36;
		numInches -= 36;
		int numFeet = numInches/12;
		numInches -= 12;
		System.out.printf("Yards: %d %n", numYards);
		System.out.printf("Feet: %d %n", numFeet);
		System.out.printf("Inches: %d %n", numInches);
	}
}
