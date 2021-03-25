import java.util.*;

public class lab01_ctVowel
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
		
//convert string to array
//check() in line 30
		for(int i = 0; i < str.length(); i++)
		{
			if(check(str.charAt(i)))
			{
				varr = Arrays.copyOf(varr, varr.length + 1);
				varr[varr.length - 1] = str.charAt(i);
			}
		}

//output results
		System.out.println("vowels count: " + varr.length);
		System.out.println("vowels: " + Arrays.toString(varr));
	}

//the function of checking of there is any vowels
	static boolean check(char c)
	{
		switch(c)
		{
			case 'A': case 'E': case 'I': case 'O': case 'U':
			case 'a': case 'e': case 'i': case 'o': case 'u':
				return(true);
			default:
				return(false);
		}
	}
}
