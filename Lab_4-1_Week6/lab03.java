import java.util.Scanner;
import java.util.Arrays;

public class lab03
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		sc.close();

		palindrome(str);
		re_palindrome(str);
	}

	static void palindrome(String str)
	{
		int size;
		size = str.length();
		char[] a, b;
		a = new char[size];
		b = new char[size];

		for(int i = 0; i < size; i++)
		{
			a[i] = str.charAt(i);
			b[i] = str.charAt((size - 1) - i);
		}
		for(int i = 0; i < size; i++)
		{
			if(a[i] == b[i])
			{
				if(i == (size - 1))
					System.out.println(str + " is a palindrom");
				continue;
			}
			else
			{
				System.out.println(str + " is not a palindrom");
				break;
			}
		}
	}
	
	static void re_palindrome(String str)
	{
		if(rep(str))
			System.out.println(str + " is a palindrom");
		else
			System.out.println(str + " is not a palindrom");
	}
	static boolean rep(String str)
	{
		if(str.length() == 1 || str.length() == 0)
			return true;
		if(str.charAt(0) == str.charAt(str.length() - 1))
			return (rep(str.substring(1, str.length() - 1)));
		return false;
	}
}
