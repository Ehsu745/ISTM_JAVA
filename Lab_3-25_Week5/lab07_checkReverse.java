import java.util.Scanner;
import java.util.Arrays;



//這題跟lab week3 第七題一模一樣...
//這題跟lab week3 第七題一模一樣...
//這題跟lab week3 第七題一模一樣...



public class lab07_checkReverse
{
	public static void main(String[] args)
	{
//define vars
		int size;
//scan input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
//define vars
		size = str.length();
		char[] a;
		char[] b;
		a = new char[size];
		b = new char[size];
//convert input to char array
		for(int i = 0; i < size; i++)
		{
			a[i] = str.charAt(i);
			b[i] = str.charAt((size - 1) - i);
		}
//check if the original input array == reversed array
		for(int i = 0; i < size; i++)
		{
			if(a[i] == b[i])
			{
				if(i == (size - 1))
					System.out.println(str + " is a palindrom");
				continue;
			}
			else
			{
				System.out.println(str + " is not a palindrom");
				break;
			}
		}
	}
}
