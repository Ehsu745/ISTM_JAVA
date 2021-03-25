import java.util.*;

public class lab03_HTswop
{
	public static void main(String[] args)
	{
//defind vars
		String str;
		char[] varr = {};

//scan input from user
		System.out.print("Enter string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();

//compare string to char array
		for(int i = 0; i < str.length(); i++)
		{
			varr = Arrays.copyOf(varr, varr.length + 1);
			varr[varr.length - 1] = str.charAt(i);
		}

//print original string
		System.out.print("Original string: ");
		for(int i = 0; i < str.length(); i++)
			System.out.print(varr[i]);

//print altered string
		System.out.print("\nAltered string: ");
		for(int i = 0; i < str.length(); i++)
		{
			varr[i] = (i == 0? str.charAt(str.length() - 1): varr[i]);
			varr[i] = (i == str.length() - 1? str.charAt(0): varr[i]);
			System.out.print(varr[i]);
		}
		System.out.print("\n");
	}
}
