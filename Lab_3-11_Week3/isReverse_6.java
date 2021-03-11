import java.util.Scanner;
import java.util.Arrays;

public class isReverse_6
{
	public static void main(String[] args)
	{
		int size;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();

		size = str.length();
		char[] a;
		a = new char[size];

		for(int i = 0; i < size; i++)
			a[i] = str.charAt(i);

		while((size - 1) >= 0)
		{
			if(a[--size] == '0')
				continue;
			System.out.print(a[size]);
		}
		System.out.print("\n");
		
	}
}
