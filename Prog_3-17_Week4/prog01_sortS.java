import java.util.*;
import java.io.*;

public class prog01_sortS
{
	public static void main(String[] args)
	{
		int[] iar = {2, 3, 1, 4, 8, 9, 0, 5};
		int[] b;
		b = new int[iar.length];

		System.out.println("Original: " + Arrays.toString(iar));
		Arrays.sort(iar);
		System.out.println("Accending: " + Arrays.toString(iar));
		for(int i = 0; i < iar.length; i++)
			b[i] = iar[iar.length - 1 - i];
		System.out.println("Descending: " + Arrays.toString(b));


		String[] str = {"Candy", "Mango", "Gum", "Apple", "Avi"};
		System.out.println("Original: " + Arrays.toString(str));
		Arrays.sort(str);
		System.out.println("Accending: " + Arrays.toString(str));
		Arrays.sort(str, Collections.reverseOrder());
		System.out.println("Descending: " + Arrays.toString(str));
	}
}
