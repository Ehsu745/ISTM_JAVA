import java.util.*;

public class lab08_shift
{
	public static void main(String[] args)
	{
//sefine array = SHIFT
		char[] arr = {'S', 'H', 'I', 'F', 'T'};

//use double for to print results
		System.out.println("arr len: " + arr.length);
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
				System.out.print(arr[(i + j) % 5]);
			System.out.print("\n");
		}
	}
}
