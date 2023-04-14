package package1;

public class Simplify {
	int result;int a; int b;
	
	public int sum(int a , int b)//((((10+2)+2)-2)*2)/2)
	{int c;
	c=a+b;
	System.out.println("Value of c is" +c );
	return c;
	}
	public int sub(int a1 , int b1)
	{
		int c1;
		c1=a1+b1;
		System.out.println("value of C1 is" +c1 );
		return c1;
	   
	}
	public int multi(int a2 , int b2)
	{
		int c2;
		c2=a2*b2;
		System.out.println("Value of c2= "+c2);
		return c2;
	}
	public  int div(int a3 ,int b3)
	{
		int c3;
		
		c3= a3/b3;
		System.out.println("value of c3 is "+c3);
		return c3;
	}
	
	public static void main(String[] args)
	{
		Simplify ob=new Simplify();
		int r1=ob.sum(10, 2);
		int r2=ob.sum(r1, 2);
		int r3=ob.sub(r2, 2);
		int r4=ob.multi(r3, 2);
		int result=ob.div(r4,2);
		System.out.println("Answer is" +result);
	}
}
