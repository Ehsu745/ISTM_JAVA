import java.util.Scanner;
import java.util.Arrays;

public class mean
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of data: ");
        int data = sc.nextInt();
		float val;
		int[] arr = {};

		val = 0;
		for(int i = 0; i < data; i++)
		{
			System.out.print("Enter number " + (i + 1) +": ");
			arr = Arrays.copyOf(arr, arr.length + 1);
			arr[arr.length - 1] = sc.nextInt();
			val += (float)arr[i];
		}
		sc.close();
        System.out.println(Arrays.toString(arr));
        System.out.println("mean is: " + (val / data));
	}
}
