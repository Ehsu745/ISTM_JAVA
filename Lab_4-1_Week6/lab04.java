import java.util.*;

class Human
{
	String name;
	int age;
	int height;

	void eat()
	{
		System.out.println("eating");
	}
	void sleep()
	{
		System.out.println("Zzz");
	}
}

class Man extends Human
{
	String sex = "male";
}

public class lab04
{
	public static void main(String[] args)
	{
		Human h1 = new Human();
		Man m1 = new Man();
		h1.eat();
		System.out.println(m1.sex);
		m1.eat();
	}
}
