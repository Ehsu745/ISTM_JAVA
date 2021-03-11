import java.util.Scanner;
import java.util.Arrays;

public class binary_9
{
	public static void main(String[] args)
	{
		int size;
		int val;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter integer: ");
		String str = sc.nextLine();

		size = str.length();
		val = 0;
		for(int i = 0; i < size; i++)
			val = (str.charAt(i) - 48) + (val * 10);

//		System.out.println(val);
		System.out.println("binary equivalent: " + intToBinary(val));
	}

	public static String intToBinary(int n)
	{
    	String s = "";
    	while (n > 0)
    	{
        	s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
        	n = n / 2;
    	}
    	return s;
	}
}
