import java.util.Scanner;
import java.util.Arrays;

public class strSum_7
{
	public static void main(String[] args)
	{
		int size;
		int val;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter integers(without space): ");
		String str = sc.nextLine();

		size = str.length();

		val = 0;
		for(int i = 0; i < size; i++)
		{
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
			{
				val += (str.charAt(i) - 48);
				System.out.print(str.charAt(i));
				if(i == (size - 1))
					System.out.print(" = " + val);
				else
					System.out.print(" + ");
			}
			else
				System.out.println("Plz enter only int");
		}

	}
}
