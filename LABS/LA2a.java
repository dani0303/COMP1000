import java.util.Scanner;

public class LA2a 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//Ask the user the number of sides
		System.out.print("Enter the number of sides: ");
		int numSides = input.nextInt();
		
		if(numSides % 1 == 0 && numSides >= 3)
		{
			double a, p, intAngle;
			
			System.out.print("Enter side length: ");
			int sideLength = input.nextInt();
			
			if(sideLength > 0)
			{
				//Calculate the area of the polygon
				a = (numSides * (Math.pow(sideLength, 2)))/(4 * ((Math.tan(Math.PI/numSides))));//Using () to take precedence in the formula
				System.out.printf("Area: %.3f%n", a);
				
				p = numSides * sideLength;
				System.out.printf("Perimeter: %.3f%n", p);
				
				intAngle = 180 - (360/numSides);
				System.out.printf("Interior Angle: %.3f degrees%n", intAngle);
			}
			else
			{
				System.out.println("Sorry the side length has to be greater than 0");
			}
		}
		else
		{
			System.out.println("Sorry number sides has to be a whole number greater than 3");
		}
	}
}
