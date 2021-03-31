import java.util.*;

public class prog02_palindrome
{
	public static void main(String[] args)
	{
//declear variables
		char[] varr = {};
//scan the input from user
		System.out.print("Enter string: ");
        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
//convert the inputed string to an array in reverse order
        for(int i = 0; i < str.length(); i++)
		{
			varr = Arrays.copyOf(varr, varr.length + 1);
            varr[varr.length - 1] = str.charAt(str.length()- 1 - i);
		}
//print the array
        for(int i = 0; i < varr.length; i++)
            System.out.print(varr[i]);
        System.out.print("\n");
	}
}
