import java.util.Scanner;

public class LA4a 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = input.nextInt();
		System.out.printf("Enter b: ");
		int b = input.nextInt();
		System.out.printf("The GCD of %d and %d is %d", a, b, GCD(a, b));
	}
	public static int GCD(int a, int b)
	{
		int t = 0;
		while(b != 0)
		{
			t = b;
			b = a%b;
			a = t;
		}
		return a;
	}
}
