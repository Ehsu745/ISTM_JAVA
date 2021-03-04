import java.util.Scanner;
import java.lang.Math.*;

public class dragon
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = sc.nextDouble();

		System.out.print("Enter b: ");
		double b = sc.nextDouble();

		System.out.print("Enter c: ");
		double c = sc.nextDouble();
		sc.close();

		double s = (a + b + c) / 2;
		double ans = s * (s - a) * (s - b) * (s - c);
		System.out.println("海龍: " + Math.sqrt(ans));
	}
}
