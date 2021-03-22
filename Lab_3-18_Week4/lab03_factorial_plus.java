import java.util.Scanner;
import java.util.Arrays;

public class lab03_factorial_plus
{
	public static void main(String[] args)
	{
        int num;
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		float val;

		val = 0;
		for(int i = 1; i <= num; i++)
		{	
			System.out.print(i + " / " + fact(i));
			if(i != num)
				System.out.print(" + ");
			val += ((float)i / (float)fact(i));
		}
		System.out.print(" = ");
        System.out.println(val);
	}

	static int fact(int n)
	{
		int val;

		val = 1;
		for(int i = 0; i < n; i++)
			val *= (i + 1);
		return(val);
	}
}
