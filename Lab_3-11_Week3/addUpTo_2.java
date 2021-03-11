import java.util.Scanner;
import java.util.Arrays;

public class addUpTo_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int data = sc.nextInt();
		float val;

		val = 0;
		if(data > 0)
		{
			for(int i = 0; i < data; i++)
				val += (i + 1);
			sc.close();
        	System.out.println("sum is: " + val);
		}
		else
			System.out.println("Error");
	}
}
