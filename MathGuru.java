import java.io.IOException;
import java.util.Scanner;

public class MathGuru {

    public static void main(String[] args) {

        int inChoice=0;
        int n=0;
        int flag=1;
        int result = 0;
        Scanner in = new Scanner(System.in);

        while (flag == 1) {
            System.out.println("Welcome to MathGuru!!!");
            System.out.println("We support the following 3 mathematical operations:");
            System.out.println("1. Exponential (2^n)");
            System.out.println("2. Factorial (n!)");
            System.out.println("3. Fibonacci (nth element)");

            System.out.print("Enter your choice: ");
            inChoice = in.nextInt();
            System.out.print("You entered: ");
            System.out.println(inChoice);

            System.out.print("Enter the number n for which you want to compute the selected mathematical operation: ");
            n = in.nextInt();
            System.out.print("You entered: ");
            System.out.println(n);

            if(n>20)
            {
                System.out.println("Please select a value of n as less than 20.");
            }
            else {
                switch(inChoice)
                {
                    case 1: result = exponential(n);
                        System.out.println("2^n for n: "+n+", is: "+result);
                        break;
                    case 2: result = factorial(n);
                        System.out.println("n! for n: "+n+", is: "+result);
                        break;
                    case 3: result = fibonacci(n);
                        System.out.println("nth element in fibonacci series for n: "+n+", is: "+result);
                        break;
                    default: System.out.println("Choose valid option.");
                }
            }

            System.out.print("Try again - (1 for Yes/ anything else for No): ");
            flag = in.nextInt();
        }

    }

    public static int exponential(int n)
    {
        int x = 2;
        for (var i = 1; i < n; i++) {
            if (n == 0) {
                x = 1;
            } 
            else if (n == 1) {
                x = 2;
            } 
            else {
                x = x * 2;
            }
        }
        return x;
    }

    public static int factorial(int n)
    {
        return 1;
    }

    public static int fibonacci(int n)
    {
        int fibOfn = 0, fibOf0 = 0, fibOf1 = 1, i;
	
		if (n < 1)
		{
			return fibOfn;
		}
		
		if (n == 1)
		{
			return fibOf1;
		}
		
		for (i = 2; i <= n; i++)
		{
			fibOfn = fibOf0 + fibOf1;
			fibOf0 = fibOf1;
			fibOf1 = fibOfn;
		}
		
		return fibOfn;
    }

}
