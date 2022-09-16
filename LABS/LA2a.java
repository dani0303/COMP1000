import java.util.Scanner;

/**
 * 
 * @author Dan
 *1. Create a scanner object named input
 *
 *2. Create a while loop that remains true
 *
 *3. (In the loop) ask the user for the number of sides and store as an integer in numSides 
 *
 *4. Initialize variables with data type double to store the area, perimeter, and interior angle
 *
 *5. Initialize variables with date type integer to store the number of sides and the length
 *
 *6. Check to see if the numSides is a whole number & >= 3 before, else tell user to use a different value
 *
 *7. Then ask the user to enter the side length and store it in sideLength
 *
 *8. Calculate the area and store in a for area then print
 *
 *9. Calculate the perimeter and store in p for perimeter then print
 *
 *10. Calculate the interior angle and store in intAngle for interior angle then print
 *
 *11. break out of loop
 */

public class LA2a 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			//Ask the user the number of sides
			System.out.print("Enter the number of sides: ");
			int numSides = input.nextInt();
			
			//a: area; p: perimeter; intAngle: interior angle;
			double a, p, intAngle;
			
			//Check to see if the numSides is a whole number and is greater than 3
			if(numSides % 1 == 0 && numSides >= 3)
			{
				System.out.print("Enter side length: ");
				int sideLength = input.nextInt();
				
				//Calculate the area of the polygon
				a = (numSides * (Math.pow(sideLength, 2)))/(4 * ((Math.tan(Math.PI/numSides))));//Using () to take precedence in the formula
				System.out.printf("Area: %.3f%n", a);
				
				p = numSides * sideLength;
				System.out.printf("Perimeter: %.3f%n", p);
				
				intAngle = 180 - (360/numSides);
				System.out.printf("Interior Angle: %3f degrees%n", intAngle);
				break;
			}
			else {System.out.println("Choose a different value");}
		}
	}
}
