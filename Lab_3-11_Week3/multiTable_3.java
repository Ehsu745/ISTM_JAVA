import java.util.Scanner;
import java.util.Arrays;

public class multiTable_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of data: ");
        int num = sc.nextInt();

		for(int i = 0; i < 9; i++)
		{
        	System.out.println(num + " * " + (i + 1) + " = " + (num * (i + 1)));
		}
		sc.close();
	}
}
