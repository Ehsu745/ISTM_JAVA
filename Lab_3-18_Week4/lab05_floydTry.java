import java.util.*;

public class lab05_floydTry
{
	public static void main(String[] args)
	{
		int count;
		System.out.print("Enter bases of tryangle: ");
		Scanner sc = new Scanner(System.in);
		int nb = sc.nextInt();
		sc.close();

		count = 1;
		for(int i = 0; i < nb; i++)
		{
			for(int j = 0; j <= i; j++)
				System.out.printf("%3d ", count++);
			System.out.print("\n");
		}
	}
}
