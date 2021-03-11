import java.util.Scanner;
import java.util.Arrays;

public class findHCF_12
{
	public static void main(String[] args)
	{
		int val_a;
		int val_b;
		int temp;

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
		sc.close();

		val_a = a;
		val_b = b;
		while(b != 0)
		{
			temp = b;
			b = a % b;
			a = b;
		}
		System.out.println(val_a + " and " + val_b + " have the HCF of " + a + "!");
	}

	public static int cpr(int a, int b)
	{
		if(a > b)
			return(b);
		else
			return(a);
	}
}
