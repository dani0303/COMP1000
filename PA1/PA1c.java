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
			System.out.printf("Choose a term (Select 0 to exit): ");
			int num = input.nextInt();
			
			if( num == 0)
			{
				System.out.println("Goodbye");
				break;
			}
			else if(num == 1)
			{
				System.out.printf("\"Java is a widely used object-oriented programming language and software platform%n");
				System.out.printf("that runs on billions of devices, including notebook computers, mobile devices,%n");
				System.out.printf("gaming consoles, medical devices and many others. The rules and syntax of Java are%n");
				System.out.printf("based on the C and C++ languages.\"%n");
				System.out.printf("IBM, 8 May 2019, https://www.ibm.com/cloud/learn/java-explained");
			}
			else if(num == 2)
			{
				System.out.printf("\"Unit Testing is a software testing technique by means of which individual units of%n");
				System.out.printf("software i.e. group of computer program modules, usage procedures, and operating%n");
				System.out.printf("procedures are tested to determine whether they are suitable for use or not.\"%n");
				System.out.printf("GeeksForGeeks, 7 June 2022, https://www.geeksforgeeks.org/unit-testing-software-testing/%n");
			}
			else if(num == 3)
			{
				System.out.printf("\"JUnit is a unit testing open-source framework for the Java programming language%n");
				System.out.printf("Java Developers use this framework to write and execute automated tests. In Java,%n");
				System.out.printf("there are test cases that have to be re-executed every time a new code is added.%n");
				System.out.printf("This is done to make sure that nothing in the code is broken.\"%n");
				System.out.printf("SimpliLearn, 28 October 2021, https://www.simplilearn.com/tutorials/java-tutorial/what-is-junit%n");
			}
			else if(num == 4)
			{
				System.out.printf("\"Exception is an unwanted or unexpected event, which occurs during the execution of a program,%n");
				System.out.printf("i.e. at run time, that disrupts the normal flow of the program’s instructions.Exceptions can be caught%n");
				System.out.printf("and handled by the program.\"%n");
				System.out.printf("GeeksForGeeks, 23 June 2022, https://www.geeksforgeeks.org/exceptions-in-java/%n");
			}
			else if(num == 5)
			{
				System.out.printf("\"Comments help programmers to communicate and understand the program. They are not programming%n");
				System.out.printf("statements and thus are ignored by the compiler. In Java, comments are preceded by two%n");
				System.out.printf("slashes (//) on a line, called a line comment, or enclosed between /* and */ on one or several%n");
				System.out.printf("lines, called a block comment or paragraph comment. When the compiler sees //, it ignores%n");
				System.out.printf("all text after // on the same line. When it sees /*, it scans for the next */ and ignores any text%n");
				System.out.printf("between /* and */.\"%n");
				System.out.printf("(Y. Daniel Liang, 13)%n");
			}
			else if(num == 6)
			{
				System.out.printf("\"JavaDoc tool is a document generator tool in Java programming language%n");
				System.out.printf("for generating standard documentation in HTML format. It generates API documentation.%n");
				System.out.printf("It parses the declarations ad documentation in a set of source file describing classes, %n");
				System.out.printf("methods, constructors, and fields.\"%n");
				System.out.printf("GeeksForGeeks, 29 June 2022, https://www.geeksforgeeks.org/what-is-javadoc-tool-and-how-to-use-it/%n");
			}
			else if(num == 7)
			{
				System.out.printf("\"The Java if statement is the most simple decision-making statement. It is used to decide whether%n");
				System.out.printf("a certain statement or block of statements will be executed or not i.e if a certain condition is true%n");
				System.out.printf("then a block of statement is executed otherwise not.\"%n");
				System.out.printf("GeeksForGeeks, 5 September 2022, https://www.geeksforgeeks.org/java-if-statement-with-examples/%n");
			}
			else
			{
				System.out.println("Choose a different number please"); 
			}
		}
	}
}
