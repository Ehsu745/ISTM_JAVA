import java.util.Scanner;

public class swap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a = sc.nextInt();

		System.out.print("Enter number 2: ");
		int b = sc.nextInt();
		sc.close();
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("New number 1: " + a);
		System.out.println("New number 2: " + b);
	}
}
