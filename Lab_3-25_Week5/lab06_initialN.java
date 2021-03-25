import java.util.*;
import java.lang.*;

public class lab06_initialN
{
	public static void main(String[] args)
	{
//define vars
		String str;
		boolean flag;
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

//declear spaces (not only whitespace since it could handle more sitiuation)
//print the first letter after find a isWhitespace
		flag = false;
		for(int i = 0; i < varr.length; i++)
		{
			if(Character.isWhitespace(varr[i]))
			{
				flag = false;
				System.out.print(". ");
				continue;
			}
			if(flag == false)
			{
				if(varr[i] >= 97 && varr[i] <= 122)
					varr[i] -= 32;
				System.out.print(varr[i]);
				flag = true;
			}
			else
				continue;
		}
	}
}
