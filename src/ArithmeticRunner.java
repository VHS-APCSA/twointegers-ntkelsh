import java.util.Scanner;
public class ArithmeticRunner {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter another number: ");
		int n2 = sc.nextInt();
		Arithmetic object = new Arithmetic(n1, n2);
		System.out.println(object.arithmetic());
		System.out.printf("%s is bigger", object.compareIntegers());
		System.out.println("\nThe first number is even: " + object.oddOrEven());
		System.out.println("The first number is a multiple of the second: " + object.multiples());
		sc.close();
	}
}
