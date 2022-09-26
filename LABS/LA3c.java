/**
 * LA3c
 */

import java.util.Scanner;

public class LA3c 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double num1, num2, num3;
		String op;

		
		System.out.printf("Enter three numbers: ");
		while(!input.hasNextInt());
		{
			num1 = input.nextInt();
			num2 = input.nextInt();
			num3 = input.nextInt();
			input.nextLine();
		}
		
		System.out.printf("Entrer the operation: ");
		op = input.nextLine();
		op = op.toLowerCase();
		
		if(op.equals("min"))
		{
			double min;
			min = Math.min(num1, Math.min(num2, num3));
			System.out.printf("min(%.2f, %.2f, %.2f) = %.2f", num1, num2, num3, min);
		}
		else if(op.equals("l1"))
		{
			double sum;
			sum = (Math.abs(num1)) + (Math.abs(num2)) + (Math.abs(num3));
			System.out.printf("l1(%.2f, %.2f, %.2f) = %.2f", num1, num2, num3, sum);
		}
		else
		{
			double quot;
			quot = (Math.sqrt((num1 * num1) + (num2 * num2) + (num3 * num3)));
			System.out.printf("l2(%.2f, %.2f, %.2f) = %.2f", num1, num2, num3, quot);
		}
	}
}
