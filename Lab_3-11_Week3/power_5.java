import java.util.Scanner;
import java.util.Arrays;

public class power_5
{
	public static void main(String[] args)
	{
		int val;

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int bas = sc.nextInt();
        System.out.print("Enter power: ");
		int pow = sc.nextInt();

		val = 1;
		for(int i = 0; i < pow; i++)
			val *= bas;
		sc.close();
        System.out.println(bas + " ^ " + pow + " = " + val);
	}
}
