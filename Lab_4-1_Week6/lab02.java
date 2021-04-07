import java.util.*;

// this example shows the application of finalize()
// java don't have destructor
// however finalize() method could do the same thing that the destructor do in other language

public class lab02 extends GregorianCalendar
// method of java.util.GregorianCalendar which is able to get calander
{
	public static void main(String[] args)
	{
		try
		{
// create a new lab02 object which extends from the GregorianCalendar
// constructing cal
			lab02 cal = new lab02();
// print current time
			System.out.println("" + cal.getTime());
// finalize cal
			System.out.println("Finalizing...");
			cal.finalize();
			System.out.println("Finalized.");
		} catch (Throwable ex)
		{
			ex.printStackTrace();
		}
	}
}
