import java.util.Scanner;

public class total
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int a_num = sc.nextInt();

		System.out.print("Enter any number: ");
		int b_num = sc.nextInt();
		sc.close();

		System.out.println(a_num + " + " + b_num + " = "  + (a_num + b_num));
	}
}
