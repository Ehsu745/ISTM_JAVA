import java.util.Scanner;
import java.util.Arrays;

public class switchCal
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type of operation(mean/midian/mode)");
		String str = sc.nextLine();
		switch(str)
		{
			case "mode":
				mode();
				break;
			case "midian":
				midian();
				break;
			case "mean":
				mean();
				break;
			default:
				System.out.println("Input Error!");
		}
	}

	public static void mean()
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
	
	public static void midian()
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

	public static void mode()
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
