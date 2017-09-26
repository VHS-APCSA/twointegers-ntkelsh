
public class TwoIntegers
{
	private int num1;
	private int num2;
	public TwoIntegers()
	{
		num1 = 0;
		num2 = 0;
	}
	public TwoIntegers(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1()
	{
		return num1;
	}
	public int getNum2()
	{
		return num2;
	}
	public void setNum1(int num1) 
	{
		this.num1 = num1;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	public String arithmetic()
	{
		return ("Sum: " + (num1 + num2) + "\nProduct: " + (num1 * num2)
				+ "\nDifference: " + (num1 - num2) + "\nQuotient: " + (num1 / num2));
	}
	public double compareIntegers()
	{
		double number = Double.NaN;
		if(num1 > num2)
		{
			number = num1;
		} else if(num1 < num2)
		{
			number = num2;
		}
		return number;
	}
	public boolean oddOrEven()
	{
		return (num1 % 2 == 0);
	}
	public boolean multiples()
	{
		return((num1 % num2) == 0);
	}
}
