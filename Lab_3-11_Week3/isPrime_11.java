import java.util.Scanner;
import java.util.Arrays;

public class isPrime_11
{
	public static void main(String[] args)
	{
		int val;

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int nb = sc.nextInt();
		sc.close();

		for(int i = 2; i < nb; i++)
		{
			if((nb % i) != 0)
				continue;
			else
			{
				System.out.println(nb + " is not a prime number!");
				return;
			}
		}
		System.out.println(nb + " is a prime number!");
	}
}
