import java.util.*;

public class lab08_random
{
	public static void main(String[] args)
	{
		int r;
		int t;
		r = (int)(Math.random() * 100);

		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("Enter guess number: ");
			t = sc.nextInt();
			switch(mySort(r, t))
			{
				case '>':
					System.out.println("Try a bigger number...");
					break;
				case '=':
					System.out.println("Bingo! You got the answer!");
					break;
				case '<':
					System.out.println("Try a smaller number...");
					break;
				default:
					System.out.println("Input Error");
			}
		} while(t != r);
	}

	public static char mySort(int a, int b)
    {
        if(a > b)
            return('>');
        else if (a == b)
            return('=');
        else
            return('<');
    }
}
