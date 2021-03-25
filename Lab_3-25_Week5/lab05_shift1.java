import java.util.*;

public class lab05_shift1
{
	public static void main(String[] args)
	{
//define vars
		String str;
		char[] varr = {};

//scan string from user
		System.out.print("Enter string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();

//convert string to char array
		for(int i = 0; i < str.length(); i++)
		{
			varr = Arrays.copyOf(varr, varr.length + 1);
			varr[varr.length - 1] = str.charAt(i);
		}

//shift array by 1
		for(int j = 0; j < varr.length; j++)
			System.out.print(varr[(1 + j) % varr.length]);
		System.out.print("\n");
	}
}
