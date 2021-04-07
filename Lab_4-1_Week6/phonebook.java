import java.util.*;
import java.io.*;

public class phonebook
{
	public static LinkedList<String> nam = new LinkedList<String>();
    public static LinkedList<String> num = new LinkedList<String>();

	static String last;

	public void insert(String name, String number)
	{
		nam.add(name);
        num.add(number);
	}
	public void insert(String name, String number, int location)
	{
		nam.add(location, name);
		num.add(location, number);
	}

	void lookUp(String prefix, StringBuffer name, StringBuffer number)
	{
		boolean flag = true;
		if(name != null)
		{
			name.delete(0, name.length());
			number.delete(0, number.length());
		}
		try
		{
			for(int i = 0; i < nam.size(); i++)
			{
				if(nam.get(i) == prefix)
				{
					flag = false;
					name.append(nam.get(i));
					number.append(num.get(i));
					last = nam.get(i);
					break;
				}
			}
			if(flag)
				throw new Exception();
		} catch(Exception e)
		{
			System.out.println("Error: input not found! " + e);
		}
	}

	void repeatLookUp(String prefix, StringBuffer name, StringBuffer number)
    {
		boolean flag = true;
		if(name != null)
        {
            name.delete(0, name.length());
            number.delete(0, number.length());
        }
        try
        {
            for(int i = 0; i < nam.size(); i++)
            {
                if(nam.get(i) == prefix)
                {
					flag = false;
                    name.append(nam.get(i) + "\t");
                    number.append(num.get(i) + "\t");
					continue;
                }
            }
			if(flag)
				throw new Exception();
        } catch(Exception e)
        {
            System.out.println("Error: input not found! " + e);
        }
    }

	void delete()
	{
		try
		{
			for(int i = 0; i < nam.size(); i++)
			{
				if(nam.get(i) == last)
                {
                    nam.remove(i);
                    num.remove(i);
					return;
                }
            }
			throw new Exception();
        } catch(Exception e)
        {
            System.out.println("Error: use lookUp to select deletion " + e);
		}
	}
}
