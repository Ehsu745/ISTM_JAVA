import java.util.Scanner;

public class swap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();

		System.out.print("Enter b: ");
		int b = sc.nextInt();
		sc.close();

		int c = a + b;
		a = c - a;
		b = c - b;

		System.out.println("\nNew a:  " + a);
		System.out.println("New b:  " + b);
	}
}
