import java.util.*;
import java.io.*;

public class prog02_sortT
{
	public static void main(String[] args)
	{
		int[] iar = {2, 3, 1, 4, 8, 9, 0, 5};
		String[] str = {"Candy", "Mango", "Gum", "Apple", "Avi"};
		int[] brr = {};
		String[] arr = {};
		boolean flag = false;

		System.out.println("Original int array: " + Arrays.toString(iar));
		System.out.println("Original string array: " + Arrays.toString(str));
		
		System.out.println("Start enter array: ");
        Scanner sc = new Scanner(System.in);
		
		try
		{
			while (sc.hasNext())
			{
				brr = Arrays.copyOf(brr, brr.length + 1);
				brr[brr.length - 1] = sc.nextInt();
				flag = true;
			}
		} catch(Exception e)
		{	
			while (sc.hasNext())
			{
				arr = Arrays.copyOf(arr, arr.length + 1);
				arr[arr.length - 1] = sc.nextLine();
			}
		}

		if(flag)
		{
			System.out.println("Original: " + Arrays.toString(brr));
			Arrays.sort(brr);
			System.out.println("Accending: " + Arrays.toString(brr));
			int[] crr;
			crr = new int[brr.length];
			for(int i = 0; i < iar.length; i++)
				crr[i] = brr[brr.length - 1 - i];
			System.out.println("Descending: " + Arrays.toString(crr));
		}
		else
		{
			System.out.println("Original: " + Arrays.toString(arr));
			Arrays.sort(arr);
			System.out.println("Accending: " + Arrays.toString(arr));
			Arrays.sort(arr, Collections.reverseOrder());
			System.out.println("Descending: " + Arrays.toString(arr));
		}
	}
}
