import java.util.Scanner;

public class LA4b 
{
	public static void main(String[] args)
	{
		double m, x, b, y, r;
		double A, slope;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for m x b and r: ");
		m = input.nextDouble();
		x = input.nextDouble();
		b = input.nextDouble();
		r = input.nextDouble();
		
		y = (m * x) + b;
		System.out.printf("%.2f = (%.2f * %.2f) + %.2f%n", y, m, x, b);
		
		System.out.print("Enter a point to calculate the slope: ");
		int ax = input.nextInt();
		int ay = input.nextInt();
		
		System.out.print("Enter another point: ");
		int bx = input.nextInt();
		int by = input.nextInt();
		
		slope = (by - ay)/(bx - ax);
		System.out.printf("The slope is %.2f = (%d - %d)/(%d - %d)%n", slope, by, ay, bx, ax);
		
		A = 4 * (Math.PI) * (r * r);
		System.out.printf("The area is %.2f = 4 * %.2f * (%.2f * %.2f)", A, Math.PI, r, r);
	}
}
