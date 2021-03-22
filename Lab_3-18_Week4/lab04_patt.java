import java.util.*;

public class lab04_patt
{
	public static void main(String[] args)
	{
		int idx;
		System.out.println("Enter number of patterns(1 ~ 6): ");
		Scanner sc = new Scanner(System.in);
		idx = sc.nextInt();
		sc.close();

		switch(idx)
		{
			case 1:
				one();
				break;
			case 2:
				two();
				break;
			case 3:
				thr();
				break;
			case 4:
				fou();
				break;
			case 5:
				fiv();
				break;
			case 6:
				six();
				break;
			default:
				System.out.println("Could you input properly?");
		}
	}

	static void sub(int a)
	{
		int count = 0;
		while(a != 1)
		{
			System.out.print(a--);
			count++;
		}
		while(count != -1)
		{
			System.out.print(a++);
			count--;
		}
	}

	static void six()
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int k = (5 - i); k > 0; k--)
                System.out.print(" ");
			sub(i);
            System.out.print("\n");
        }
    }

	static void fiv()
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int k = (5 - i); k > 0; k--)
                System.out.print(" ");
            for(int j = 0; j < (i + (i - 1)); j++)
                System.out.print(i);
            System.out.print("\n");
        }
    }

	static void fou()
    {
        for(int i = 1; i <= 5; i++)
        {
			for(int k = (5 - i); k > 0; k--)
                System.out.print(" ");
            for(int j = 0; j < (i + (i - 1)); j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }

	static void thr()
    {
		char c;
        for(int i = 5; i > 0; i--)
        {
			c = ' ';
            for(int j = 5; j > 0; j--)
			{
				if(j == 5 - (i - 1))
					c = '*';
                System.out.print(c);
			}
            System.out.print("\n");
        }
    }

	static void two()
	{
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

	static void one()
	{
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 10; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}
