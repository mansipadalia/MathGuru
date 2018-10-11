import java.util.InputMismatchException;
import java.util.Scanner;
public class MathGuru {
	public static void main(String[] args) {
		int inChoice = 0;
		int n = 0;
		int flag = 1;
		double result = 0;
		Scanner in = new Scanner(System.in);

		while (flag == 1) {
			System.out.println("Welcome to MathGuru!!!");
			System.out.println("We support the following 3 mathematical operations:");
			System.out.println("1. Exponential (2^n)");
			System.out.println("2. Factorial (n!)");
			System.out.println("3. Fibonacci (nth element)");
			try {
				System.out.print("Enter your choice: ");
				inChoice = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("Enter an integer");
			}
			System.out.print("You entered: ");
			System.out.println(inChoice);
			try {
				System.out.print(
						"Enter the number n for which you want to compute the selected mathematical operation: ");
				n = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("Enter an integer");
			}
			System.out.print("You entered: ");
			System.out.println(n);

			if (n > 20 || n < 0) {
				System.out.println("Please select a value of n as greater than 0 and less than 20.");
			} else {
				switch (inChoice) {
				case 1:
					result = exponential(n);
					System.out.println("2^n for n: " + n + ", is: " + result);
					break;
				case 2:
					result = factorial(n);
					System.out.println("n! for n: " + n + ", is: " + result);
					break;
				case 3:
					result = fibonacci(n);
					System.out.println("nth element in fibonacci series for n: " + n + ", is: " + result);
					break;
				default:
					System.out.println("Choose valid option.");
					break;
				}
			}
			System.out.print("Try again - (1 for Yes/ anything else for No): ");
			flag = in.nextInt();
		}

	}

	public static int exponential(int n) {
		if (n == 0)
			return 1;

		int x = 2;
		for (int i = 1; i < n; i++) {
			if (n == 1) {
				x = 2;
			} else {
				x = x * 2;
			}
		}
		return x;
	}

	public static double factorial(int n) {
		double result = 1;

		for (int i = 2; i <= n; i++) {
			result = result * i;
		}

		return result;
	}

	public static int fibonacci(int n) {
		int fibOfn = 0, fibOf0 = 0, fibOf1 = 1, i;

		if (n < 1) {
			return fibOfn;
		}

		if (n == 1) {
			return fibOf1;
		}

		for (i = 2; i <= n; i++) {
			fibOfn = fibOf0 + fibOf1;
			fibOf0 = fibOf1;
			fibOf1 = fibOfn;
		}

		return fibOfn;
	}

}
