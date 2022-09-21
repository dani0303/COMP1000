import java.util.Scanner;
public class PA02 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a, b, c;
		double d, root, root2;
		System.out.print("Enter a b c: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		d = Math.pow(b, 2) - (4 * (a * c));
		
		if(d < 0)
		{
			System.out.println("Roots: imaginary");
		}
		
		else if(d == 0)
		{
			root = (-b)/(2 * a);
			System.out.printf("Roots: %.2f%n", root);
		}
		else
		{
			root = (-b + Math.sqrt((d)))/2;
			root2 = (-b - Math.sqrt((d)))/2;
			if(root < root2)
			{
				System.out.printf("Roots: %.2f and %.2f", root, root2);
			}
			else
			{
				System.out.printf("Roots: %.2f and %.2f", root2, root);
			}
		}
	}
}
