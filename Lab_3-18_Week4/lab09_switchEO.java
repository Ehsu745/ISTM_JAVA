import java.util.*;

public class lab09_switchEO
{
	public static void main(String[] args)
	{
		int i;
		System.out.print("Input 1(for loop) or 2(while loop) to choose methood: ");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		sc.close();

		switch(i)
		{
			case 1:
				f_loop();
				break;
			case 2:
				w_loop();
				break;
			default:
				System.out.println("Input Error!");
		}
	}

	static void f_loop()
	{
		for(int i = 1; i < 1000; i += 2)
			pt(i);
	}

	static void w_loop()
	{
		int i = 0;
		while((i += 2) <= 1000)
			pt(i);
	}

	static void pt(int i)
	{
		System.out.print(i);
		if(i == 999 || i == 1000)
			System.out.print(".\n");
		else
			System.out.print(", ");
	}
}
