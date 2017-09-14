import java.util.Scanner;
public class Arithmetic
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		System.out.println("Enter your first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter your second number: ");
		num2 = sc.nextInt();
		System.out.printf("Sum: %s\nProduct: %s\nDifference: %s\nQuotient: %s", (num1 + num2), (num1 * num2), (num1 - num2), (num1 / num2));
	}
}