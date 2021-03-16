import java.util.*;

public class mode
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of data: ");
        int data = sc.nextInt();
		float val;
		int[] arr = {};
		int[] a = {};

		val = 0;
		for(int i = 0; i < data; i++)
		{
			System.out.print("Enter number " + (i + 1) +": ");
			arr = Arrays.copyOf(arr, arr.length + 1);
			arr[arr.length - 1] = sc.nextInt();
			val += (float)arr[i];
		}
		sc.close();
		a = Arrays.copyOf(arr, arr.length);
		Arrays.sort(a);
        System.out.println("Origin input: " + Arrays.toString(arr));
        System.out.println("Sorted input: " + Arrays.toString(a));

    	int maxValue;
		int maxCount;

		maxValue = 0;
		maxCount = 0;
		for (int i = 0; i < a.length; ++i)
		{
			int count = 0;
			for (int j = 0; j < a.length; ++j)
				if (a[j] == a[i])
					++count;
			if (count > maxCount)
			{
				maxCount = count;
				maxValue = a[i];
			}
		}
    	System.out.println(maxValue);
	}
}
