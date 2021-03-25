import java.util.*;

public class lab04_strRev
{
	public static void main(String[] args)
	{
//define vars
		String str;
		char[] varr = {};

//scan input from user
		System.out.print("Enter string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();

//conver string to array
		for(int i = 0; i < str.length(); i++)
		{
			varr = Arrays.copyOf(varr, varr.length + 1);
			varr[varr.length - 1] = str.charAt(i);
		}

//print original string
		System.out.print("Original string: ");
		for(int i = 0; i < str.length(); i++)
			System.out.print(varr[i]);

//conver string to array in reverse order and print reversed string
		System.out.print("\nAltered string: ");
		for(int i = 0; i < str.length(); i++)
			varr[i] = str.charAt(str.length()- 1 - i);
		for(int i = 0; i < str.length(); i++)
			System.out.print(varr[i]);
		System.out.print("\n");
	}
}
