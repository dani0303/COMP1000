import java.util.Scanner;

public class PA1c 
{
	public static void main(String[] args)
	{
		while(true)
		{
			Scanner input = new Scanner(System.in);
			
			System.out.println("1. Java");
			System.out.println("2. Unit Tests");
			System.out.println("3. JUnit Tests");
			System.out.println("4. Exceptions");
			System.out.println("5. Comments");
			System.out.println("6. Javadocs");
			System.out.println("7. Conditionals");
			System.out.println("To exit press 0");
			int num = input.nextInt();
			
			if(num == 1)
			{
				System.out.printf("Java is a widely used object-oriented programming language and software platform%n");
				System.out.printf("that runs on billions of devices, including notebook computers, mobile devices,%n");
				System.out.printf("gaming consoles, medical devices and many others. The rules and syntax of Java are%n");
				System.out.printf("based on the C and C++ languages.%n");
				System.out.printf("IBM, 8 May 2019, https://www.ibm.com/cloud/learn/java-explained");
			}
			else if(num == 2)
			{
				System.out.printf("Unit Testing is a software testing technique by means of which individual units of%n");
				System.out.printf("software i.e. group of computer program modules, usage procedures, and operating%n");
				System.out.printf("procedures are tested to determine whether they are suitable for use or not%n");
				System.out.printf("GeeksForGeeks, 7 June 2022, https://www.geeksforgeeks.org/unit-testing-software-testing/%n");
			}
			else if(num == 3)
			{
				System.out.printf("JUnit is a unit testing open-source framework for the Java programming language%n");
				System.out.printf(" Java Developers use this framework to write and execute automated tests. In Java,%n");
				System.out.printf("there are test cases that have to be re-executed every time a new code is added.%n");
				System.out.printf("This is done to make sure that nothing in the code is broken.%n");
				System.out.printf("SimpliLearn, 28 October 2021, https://www.simplilearn.com/tutorials/java-tutorial/what-is-junit%n");
			}
			else if(num == 4)
		}
	}
}
