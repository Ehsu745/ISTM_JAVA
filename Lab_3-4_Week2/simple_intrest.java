import java.util.Scanner;

public class simple_intrest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principle: ");
		float p = sc.nextFloat();

		System.out.print("Enter rate: ");
		float r = sc.nextFloat();

		System.out.print("Enter time: ");
		float t = sc.nextFloat();
		sc.close();

		System.out.println("Your simple intrest value is: ");
		System.out.println(p * r * t / 100.0);
	}
}
