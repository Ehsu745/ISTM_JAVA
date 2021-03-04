import java.util.Scanner;

public class swap
{
	public static void main(String[] args)
	{
		int[] a;
		a = new int[2];

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		a[0] = sc.nextInt();

		System.out.print("Enter number 2: ");
		a[1] = sc.nextInt();
		sc.close();

		for(int i = 0; i < 2; i++)
		{
			System.out.print("New number " + (i + 1) + " : ");
			System.out.println(a[2 - (i + 1)]);
		}
	}
}
