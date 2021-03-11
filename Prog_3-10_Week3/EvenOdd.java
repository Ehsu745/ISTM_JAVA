import java.util.Scanner;

public class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = sc.nextInt();

		if((i % 2) != 0)
        	System.out.println(i + " is a odd number");
		else
        	System.out.println(i + " is a even number");
	}
}
