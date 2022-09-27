/**
 * @Dan
 */

import java.util.Scanner;

public class LA3c 
{
	public static void main(String[] args)
	{
		/**
		 * num1 num2 num3 (store the numbers entered by the user)
		 * result (is first initialized and stores the answer depending on the operator)
		 * op (is set to hold an empty value in order to run the do while loop to check if the operator is
		 * in lowercase)
		 */
		Scanner input = new Scanner(System.in);
		double num1, num2, num3, result;
		String op = "";

		System.out.printf("Enter three numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		input.nextLine();
		
		do
		{
			System.out.printf("Entrer the operation: ");
			op = input.nextLine();
		}while(!op.equals(op.toLowerCase()));
		
		if(op.equals("min"))
		{
			result = Math.min(num1, Math.min(num2, num3));
		}
		else if(op.equals("l1"))
		{
			result = (Math.abs(num1)) + (Math.abs(num2)) + (Math.abs(num3));
		}
		else
		{
			result = (Math.sqrt((num1 * num1) + (num2 * num2) + (num3 * num3)));
		}
		System.out.printf(op + "(%.2f, %.2f, %.2f) = %.2f", num1, num2, num3, result);
	}
}
