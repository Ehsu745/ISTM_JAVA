import java.util.*;

public class prog01_recu
{
	public static void main(String[] args)
	{

		for (int i = 0; i < 100; i++)
		{
			if(fibo(i) < 100)
				System.out.print(fibo(i) + " ");
			else
				break;
		}
	}

	static int fibo(int n)
	{
		if (n == 0 || n == 1)
			return(n);
		else
			return(fibo(n - 1) + fibo(n - 2));
	}
}
