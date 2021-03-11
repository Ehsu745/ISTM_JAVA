import java.util.Scanner;
import java.util.Arrays;

public class ItoB_10
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
			val = (str.charAt(i) - 48) + (val * 2);

//		System.out.println(val);
		System.out.println("int equivalent: " + val);
	}
}
