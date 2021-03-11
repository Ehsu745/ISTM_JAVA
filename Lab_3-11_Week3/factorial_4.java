import java.util.Scanner;
import java.util.Arrays;

public class factorial_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to calculate the factorial: ");
        int num = sc.nextInt();
		int val;

		val = 1;
		for(int i = 0; i < num; i++)
		{
			val *= (i + 1);
		}
		sc.close();
        System.out.println(num + "! = " + val);
	}
}
