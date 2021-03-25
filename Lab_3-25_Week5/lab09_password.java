import java.util.*;

public class lab09_password
{
	public static void main(String[] args)
	{
//degine vars
		String str;
		char[] varr = {};
		int u, l, d;

//redo if something went wrong
		while(true)
		{

//scan password from users
			u = l = d = 0;
			System.out.print("Enter new password: ");
			Scanner sc = new Scanner(System.in);
			str = sc.nextLine();


//count the Uppercase, Loweredcase, number digits in the user input
			for(int i = 0; i < str.length(); i++)
			{
				varr = Arrays.copyOf(varr, varr.length + 1);
				varr[varr.length - 1] = str.charAt(i);

				if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
					u++;
				else if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
					l++;
				else if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
					d++;
				else
					continue;
			}

//if any of Uppercase, Loweredcase, number digits is not enough stop and redo
			if(u == 0 || l == 0 || d == 0)
			{
				System.out.println("Password should at least contain one Uppercase,	Loweredcase and a number");
				varr = Arrays.copyOf(varr, 0);
				continue;
			}
			else if(varr.length < 8)
			{
				System.out.println("Password should contain at least 8 charactors");
				varr = Arrays.copyOf(varr, 0);
				continue;
			}

//password success, congradulations!
			else
			{
				System.out.print("Success! Your new password is: ");
				for(int i = 0; i < str.length(); i++)
					System.out.print(varr[i]);
				System.out.print('\n');
				break;
			}		
		}
	}
}
