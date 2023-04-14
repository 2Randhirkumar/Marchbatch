package package1;

public class Simplify1 {
int result;int a; int b;
	
	public int sum(int a , int b)//((((10*2)-2)+2)-2)/2)
	{int c;
	c=a+b;
	System.out.println("Value of c is" +c );
	return c;
	}
	public int sub(int a , int b)
	{
		int c1;
		c1=a+b;
		System.out.println("value of C1 is" +c1 );
		return c1;
	   
	}
	public int multi(int a , int b)
	{
		int c2;
		c2=a*b;
		System.out.println("Value of c2= "+c2);
		return c2;
	}
	public  int div(int a ,int b)
	{
		int c3;
		
		c3= a/b;
		System.out.println("value of c3 is "+c3);
		return c3;
	}
	
	public static void main(String[] args)
	{
		Simplify ob=new Simplify();
		int r1=ob.multi(10, 2);
		int r2=ob.sub(r1, 2);
		int r3=ob.sum(r2, 2);
		int r4=ob.sub(r3, 2);
		int result=ob.div(r4,2);
		System.out.println("Answer is " +result);
	}
}



