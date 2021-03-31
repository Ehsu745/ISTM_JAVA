import java.util.*;

public class prog01_recu
{
	public static void main(String[] args)
	{
//do the commands in the loop 100 times
		for (int i = 0; i < 100; i++)
		{
//if the value of fibo returns is more than 100, don't print and end the function
			if(fibo(i) < 100)
				System.out.print(fibo(i) + " ");
			else
				break;
		}
	}

//the maim(主要的) function which solves the fibonacci sequence
	static int fibo(int n)
	{
//if the recieve number is 0 or 1 just simply return it since the first three number is the same
		if (n == 0 || n == 1)
			return(n);
//if the recieve number is not 0 nor 1, return f_n-1 + f_n-2(definition of fibonacci sequence)
		else
			return(fibo(n - 1) + fibo(n - 2));
	}
}
