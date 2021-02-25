import java.util.Scanner;

public class input
{
	public static void main(String[] args)
	{
		Scanner a_sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int a_num = a_sc.nextInt();

		Scanner b_sc = new Scanner(System.in);
		System.out.print("\nEnter any number: ");
		int b_num = b_sc.nextInt();
		a_sc.close();
		b_sc.close();

		System.out.print(a_num * b_num);
	}
}
