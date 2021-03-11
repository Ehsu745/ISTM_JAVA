import java.util.Scanner;
import java.util.Arrays;

public class print_1
{
	public static void main(String[] args)
	{
		int index;
		index = 10;
		for(int i = 0; i < index; i++)
		{
			System.out.print((i+1));
			if(i != index - 1)
        		System.out.print(", ");
		}
        System.out.println(".");
	}
}
