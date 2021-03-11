import java.util.Scanner;

public class LessGreat
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

		sc.close();
        System.out.println(a + " " + mySort(a, b) + " " + b);
	}

	public static char mySort(int a, int b)
	{
		if(a > b)
			return('>');
		else if (a == b)
			return('=');
		else
			return('<');
	}
}
