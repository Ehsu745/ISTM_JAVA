import java.util.*;

public class prog03_PNOE0
{
	public static void main(String[] args)
	{
		String str = "";
		int[] arr = {};
		int P, N, O, E, Z;

		System.out.println("Enter numbers: ");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			arr = Arrays.copyOf(arr, arr.length + 1);
			arr[arr.length - 1] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		P = N = O = E = Z = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > 0)
				P++;
			else if(arr[i] == 0)
				Z++;
			else
				N++;
		}
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
				E++;
			else
				O++;
		}
		System.out.println("Positive: " + P);
		System.out.println("Negative: " + N);
		System.out.println("Odd: " + O);
		System.out.println("Even: " + E);
		System.out.println("Zero: " + Z);
	}
}
