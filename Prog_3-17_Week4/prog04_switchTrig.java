import java.util.*;

public class prog04_switchTrig
{
	public static void main(String[] args)
	{
		double temp;;
		double sin = 0;
		double cos = 0;
		System.out.println("Enter Trig. function: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Enter x and n to evaluate sin x: ");
		System.out.print("x:");
		int x = sc.nextInt();
		System.out.print("n:");
		for(int i = 0; i < n; i++)
			cos += ((double)pow(-1, i) / (double)fact(2 * i)) * (double)pow(x, 2 * i);
		for(int i = 0; i < n; i++)
			sin += ((double)pow(-1, i) / (double)fact((2 * i) + 1)) * (double)pow(x, (2 * i) + 1);
		switch(s)
		{
			case "sin":
				System.out.println(sin);
				break;
			case "cos":
				System.out.println(cos);
				break;
			case "tan":
				System.out.println(sin / cos);
				break;
			case "cot":
				System.out.println(cos / sin);
				break;
			case "sec":
				System.out.println(1 / cos);
				break;
			case "csc":
				System.out.println(1 / sin);
				break;
			default:
				System.out.println(s + "is not a Trig. function!");
		}
		sc.close();
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
