package javapack;

class A1
{
	void sum()
	{
		System.out.println("default method");
	}
	void sum(int x)
	{
		System.out.println("1 param method");
	}
	void sum(int x,int y)
	{
		System.out.println("2 param method");
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		A1 b=new A1();
		b.sum(1);

	}

}
