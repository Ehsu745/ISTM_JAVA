import java.util.Scanner;
import java.util.Arrays;

public class findHCF_12
{
	public static void main(String[] args)
	{
		int temp;

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
		sc.close();

		System.out.println("HCF: " + hcf(a, b));
	}

	private static int hcf(int m, int n)
	{
        if(n == 0)
            return(m);
        else
            return(hcf(n, m % n));
    }
}
