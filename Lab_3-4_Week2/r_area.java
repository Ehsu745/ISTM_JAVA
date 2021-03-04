import java.util.Scanner;

public class r_area
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		float l = sc.nextFloat();
		System.out.print("Enter Width: ");
		float w = sc.nextFloat();
		sc.close();
		System.out.print("Area = ");
		System.out.printf("%.2f\n", (l * w));
		System.out.print("Circumference = ");
		System.out.printf("%.2f\n", (2 * (l + w)));
	}
}
