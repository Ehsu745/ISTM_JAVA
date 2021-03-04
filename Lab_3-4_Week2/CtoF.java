import java.util.Scanner;

public class CtoF
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temp. in °C: ");
		float C_deg = sc.nextFloat();
		sc.close();
		System.out.println(((1.8 * C_deg) + 32) + " °F");
	}
}
