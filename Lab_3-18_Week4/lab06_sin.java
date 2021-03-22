import java.util.*;

public class lab06_sin
{
	public static void main(String[] args)
	{
		double temp;;
		double res;

		System.out.println("Enter x and n to evaluate sin x: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("x:");
		int x = sc.nextInt();
		System.out.print("n:");
		int n = sc.nextInt();
		sc.close();

// res += (-1 ^ k) / (2k+1)! * (x ^ (2k + 1))

		res = 0;
		for(int i = 0; i < n; i++)
			res += ((double)pow(-1, i) / (double)fact((2 * i) + 1)) * (double)pow(x, (2 * i) + 1);
		System.out.println("sin x = " + res);
	}

	static int fact(int n)
	{
		int val;

		val = 1;
		for(int i = 0; i < n; i++)
			val *= (i + 1);
		return(val);
	}

	static int pow(int a, int b)
	{
		int val = 1;
		for(int i = 0; i < b; i++)
			val *= a;
		return(val);
	}
}
