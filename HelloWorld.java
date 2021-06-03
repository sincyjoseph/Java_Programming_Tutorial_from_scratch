
public class HelloWorld
{
	public static void  print(String input)
	{
		System.out.println(input);
	}

	public static double sum(double x, double y)
	{
		double res = x + y;
		return res;
	}
	public static void main(String[] args)
	{
			print("Hello World");
			print("Finding Sum");

			double x = sum(50.63,100.35);

			System.out.println(x);
	}
}
