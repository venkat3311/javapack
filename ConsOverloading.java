package javapack;

class E
{
	E()
	{
		System.out.println("Default cons");
	}
	E(int x)
	{
		System.out.println("1 param cons");
	}
	E(int x,int y)
	{
		System.out.println("2 param cons");
	}
}

public class ConsOverloading {

	public static void main(String[] args) {
		
		E b=new E(1,2);

	}

}
