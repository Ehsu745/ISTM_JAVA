import java.util.*;

public class main
{
	public static void main(String[] args)
	{
		
		System.out.println("\n=======================lab01=========================\n");

		lab01_Rev rev = new lab01_Rev();
		rev.strRev();

		System.out.println("\n=======================lab===========================\n");

		phonebook ph = new phonebook();
		ph.insert("Tina", "0987987987");
		ph.insert("Eric", "0928583566");
		ph.insert("Cloie", "0979656299", 1);
		ph.insert("87", "948787", 3);
		ph.insert("Tina", "0987987987");
        System.out.println("name list: " + ph.nam);
        System.out.println("numner list: " + ph.num);


		StringBuffer name = new StringBuffer("");
		StringBuffer number = new StringBuffer("");
//look up test
		System.out.println("\nlook up test===========================");
		ph.lookUp("87" , name, number);
		System.out.println(name + " " + number);
		ph.lookUp("Fake" , name, number);

//repeat look up test
		System.out.println("\nrepeat look up test====================");
		ph.repeatLookUp("Tina" , name, number);
		System.out.println(name + "\n" + number);

//delete test
		System.out.println("\ndelete test============================");
		ph.lookUp("Eric" , name, number);
		ph.delete();
		System.out.println("name list: " + ph.nam);
		System.out.println("numner list: " + ph.num);
	}
}
