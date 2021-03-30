import java.util.*;

public class lab10_UsNtd
{
	public static void main(String[] args)
	{
//define vars
		int flag;
		String in = "US$", out = "NTD$";
		float rate;
		float mon;

//scan string from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the exchange rate between US$ and NTD$: ");
		rate = sc.nextFloat();

		System.out.print("Enter 0 to convert USD to NTD and 1 for vice versa: ");
		flag = sc.nextInt();

//determine US and NTD
		if(flag != 0 && flag != 1)
		{
			System.out.println("Invalid input...");
			return;
		}
		else if(flag == 1)
		{
			in = "NTD$";
			out = "US$";
		}

		System.out.print("Enter the dollar amount: ");
		mon = sc.nextFloat();

//print results
		if(flag == 0)
			System.out.println(mon + " " + in + " is " + (mon * rate) + " " + out);
		else
			System.out.println(mon + " " + in + " is " + (mon / rate) + " " + out);
	}
}
