import java.util.Scanner;

class LA1a 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.println("Welcome " + name);
        
        System.out.print("Enter five numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        
        double sum = num1 + num2 + num3 + num4 + num5;
        System.out.printf("Sum: %.2f %n", Math.round(sum*100.0)/100.0);
        
        double mean = sum/5;
        System.out.printf("Mean: %.2f %n", Math.round(mean*100.0)/100.0);
        
        int diff1 = (int)(num1 - mean);
        int diff2 = (int)(num2 - mean);
        int diff3 = (int)(num3 - mean);
        int diff4 = (int)(num4 - mean);
        int diff5 = (int)(num5 - mean);
        
        int sum2 = ((diff1*diff1) + (diff2*diff2) + (diff3*diff3) + (diff4*diff4) + (diff5*diff5))/num5;
        double result = Math.sqrt(sum2);
        System.out.println("Population Standard Deviation: " + Math.round(result * 100.0)/100.0);
        System.out.println("Thank you for running LA1a, " + name + "! Goodbye.");
    }
}
