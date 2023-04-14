package package1;

import org.omg.Messaging.SyncScopeHelper;

public class Students 
{
	int age;int RollNumber;
	public void Display1()
	
	{
		System.out.println("Welcome to automation class");
		
		
	}
	public void Display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[]args)
	
	{
		Students a=new Students();
		a.Display1();
		Students b=new Students();
		b.Display2();
		a.age =45;
		b.RollNumber =28;
		System.out.println(a.age);
		System.out.println(b.RollNumber);
	}
	}
	
	
	
	


