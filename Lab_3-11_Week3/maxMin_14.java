import java.util.Scanner;
import java.util.Arrays;

public class maxMin_14
{
	public static void main(String[] args)
	{
		int[] arr = {};
		int max;
		int min;
		System.out.println("Start enter numbers: ");
		Scanner sc = new Scanner(System.in);

		max = 0;
		min = 0;
		while (sc.hasNext())
		{
			arr = Arrays.copyOf(arr, arr.length + 1);
			arr[arr.length - 1] = sc;
		}
		Arrays.sort(arr);
		System.out.println("Max: " + arr[1]);
		System.out.println("min: " + arr[arr.length - 1]);
	}
}
