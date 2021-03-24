import java.util.*;

public class prog02_sumPro
{
	public static void main(String[] args)
	{
		String str = "";
		int[] arr = {};
		int sum;
		int pro;

		System.out.println("Enter numbers: ");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			arr = Arrays.copyOf(arr, arr.length + 1);
			arr[arr.length - 1] = sc.nextInt();
		}
		sum = 0;
		pro = 1;
		for(int i = 1; i <= arr.length; i++)
		{
			sum += i;
			pro *= i;
		}
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + pro);
	}
}
