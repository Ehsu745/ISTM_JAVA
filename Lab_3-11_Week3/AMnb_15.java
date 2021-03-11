import java.util.Scanner;
import java.util.Arrays;

public class AMnb_15
{
	public static void main(String[] args)
	{
		int temp;
		int[] nb;
		nb = new int[3];
		for(int i = 0; i < 999; i++)
		{
			temp = i;
			if(i < 10)
			{
				nb[0] = 0;
				nb[1] = 0;
				nb[2] = (String.valueOf(temp).charAt(0) - 48);
			}
			else if(i < 100)
			{
				nb[0] = 0;
				nb[1] = (String.valueOf(temp).charAt(0) - 48);
				nb[2] = (String.valueOf(temp).charAt(1) - 48);
			}
			else
			{
				for(int j = 0; j < 3; j++)
				{
					nb[j] = (String.valueOf(temp).charAt(j) - 48);
				}
			}
			if((cube(nb[0]) + cube(nb[1]) + cube(nb[2])) == i)
				System.out.println(i);
		}
	}

	public static int cube(int s)
	{
		int r;
		r = s * s * s;
		return(r);
	}
}
