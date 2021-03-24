import java.util.*;

public class prog01_scanArr
{
	public static void main(String[] args)
	{
		String str = "";
		int[] arr = {};

		System.out.print("Enter numbers: ");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			arr = Arrays.copyOf(arr, arr.length + 1);
			arr[arr.length - 1] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++)
		{
			str = (i == arr.length - 1? ".\n": ", ");
			System.out.print(arr[i] + str);
		}
	}
}
