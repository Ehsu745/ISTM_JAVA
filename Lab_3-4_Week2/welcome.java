import java.util.Scanner;

public class welcome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String str = sc.nextLine();

		System.out.println("Hello " + str);
	}
}
