import java.util.Scanner;
import java.util.Arrays;

public class EOF_13
{
	public static void main(String[] args)
	{
		int tm;
		int neg;
		int pos;
		int zero;
		System.out.println("Start enter numbers: ");
		Scanner sc = new Scanner(System.in);

		neg = 0;
		pos = 0;
		zero = 0;
		while (sc.hasNext())
		{
			tm = sc.nextInt();
			if(tm == 0)
				zero++;
			else if(tm > 0)
				pos++;
			else
				neg++;
		}
		System.out.println("Zeros: " + zero);
		System.out.println("Positives: " + pos);
		System.out.println("Negatives: " + neg);
	}
}
