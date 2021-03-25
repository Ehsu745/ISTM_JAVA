import java.util.*;

public class lab02_SortStr
{
	public static void main(String[] args)
	{
//degine vars
		String str;
		char[] varr = {};
		int u, l, d, s;

//scan in strings
		System.out.print("Enter string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
//convert string to char array
		u = l = d = s = 0;
		for(int i = 0; i < str.length(); i++)
		{
			varr = Arrays.copyOf(varr, varr.length + 1);
			varr[varr.length - 1] = str.charAt(i);
//sort types of char
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
				u++;
			else if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
				l++;
			else if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
				d++;
			else if(str.charAt(i) == 32)
				s++;
			else
				continue;
		}
//print sorted result
		System.out.println(Arrays.toString(varr));
		System.out.println("Uppercase: "	+ u);
		System.out.println("Lowercase: "	+ l);
		System.out.println("Digits: "		+ d);
		System.out.println("WhiteSpaces: "	+ s);
	}
}
