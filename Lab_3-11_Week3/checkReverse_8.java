import java.util.Scanner;
import java.util.Arrays;

public class checkReverse_8
{
	public static void main(String[] args)
	{
		int size;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();

		size = str.length();
		char[] a;
		char[] b;
		a = new char[size];
		b = new char[size];

		for(int i = 0; i < size; i++)
		{
			a[i] = str.charAt(i);
			b[i] = str.charAt((size - 1) - i);
		}

//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
		for(int i = 0; i < size; i++)
		{
			if(a[i] == b[i])
			{
				if(i == (size - 1))
					System.out.println(str + " is a palindromic number");
				continue;
			}
			else
			{
				System.out.println(str + " is not a palindromic number");
				break;
			}
		}
	}
}
