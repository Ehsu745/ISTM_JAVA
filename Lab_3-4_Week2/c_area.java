import java.util.Scanner;

public class c_area
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		float r = sc.nextFloat();
		sc.close();
		System.out.print("Area = ");
		System.out.printf("%.2f\n", (r * r * Math.PI));
		System.out.print("Circumference = ");
		System.out.printf("%.2f\n", (2 * r * Math.PI));
	}
}
