import java.util.*;

public class midian
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of data: ");
        int data = sc.nextInt();
		float val;
		int[] arr = {};
		int[] sed_arr = {};

		val = 0;
		for(int i = 0; i < data; i++)
		{
			System.out.print("Enter number " + (i + 1) +": ");
			arr = Arrays.copyOf(arr, arr.length + 1);
			arr[arr.length - 1] = sc.nextInt();
			val += (float)arr[i];
		}
		sc.close();
		sed_arr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sed_arr);
        System.out.println("Origin input: " + Arrays.toString(arr));
        System.out.println("Sorted input: " + Arrays.toString(sed_arr));

		double median;
		if (sed_arr.length % 2 == 0)
    		median = ((double)sed_arr[sed_arr.length/2] + (double)sed_arr[sed_arr.length/2 - 1])/2;
		else
    		median = (double) sed_arr[sed_arr.length/2];
        System.out.println("Median: " + median);
	}
}
