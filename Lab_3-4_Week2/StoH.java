import java.util.Scanner;

public class StoH
{
	public static void main(String[] args)
	{
		int s;
		int m;
		int h;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter seconds: ");
		s = sc.nextInt();
		sc.close();

		h = s / 3600;
		m = s / 60 - (h * 60);
		s = s - ((h * 3600) + (m * 60));
		System.out.println("Hours: " + h);
		System.out.println("Minutes: " + m);
		System.out.println("Seconds: " + s);
	}
}
