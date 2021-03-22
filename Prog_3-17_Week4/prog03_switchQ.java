import java.util.*;

public class prog03_switchQ
{
	public static void main(String[] args)
	{
		System.out.print("Enter any int: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		while(i > 10)
		{
			if(i % 7 == 0)
				i = i % 10;
			else
				i = i / 10;
		}
		for(int k = 0; k < 10; k++)
		{
			i = (i + k) > 10 ? ((i + k) - 10): (i + k);
			switch(i)
			{
				case 1:
					System.out.println("Q1: What is your name?");
					break;
				case 2:		
					System.out.println("Q2: Where do you live?");
				case 3:
					System.out.println("Q3: Is it a boring place?");
					break;
				case 4:
					System.out.println("Q4: What's your dog's name?");
					continue;
				case 5:
					System.out.println("Q5: Do you have siblings?");
					break;
				case 6:
					System.out.println("Q6: What car do you drive?");
					break;
				case 7:
					System.out.println("Q7: How do you go to school?");
					break;
				case 8:
					System.out.println("Q8: Do you like memes?");
					break;
				case 9:
					System.out.println("Q9: Do you have a girlfriend?");
					break;
				case 10:
					System.out.println("Q10: How many times do you have sex per week?");
					break;
				default:
					System.out.println("Input Error");
			}
		}
	}
}
