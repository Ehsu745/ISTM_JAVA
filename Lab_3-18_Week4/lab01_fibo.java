import java.util.*;

public class lab01_fibo
{
	public static void main(String[] args)
	{
		int i = 0, j = 1, x;
		for(x = 0; x <= 25; x++)
		{
			if(i < j)
			{
				System.out.print(i);
				i = i + j;
			}
			else
			{
				System.out.print(j);
				j = i + j;
			}
			if(x == 25)
				System.out.println(".");
			else
				System.out.print(", ");
		}
	}
}
