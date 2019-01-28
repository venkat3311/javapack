package javapack;

interface I
{
	void m1();
	void m2();
}
class AB implements I
{
	public void m1()
	{
		System.out.println("m1() in AB");
	}
	public void m2()
	{
		System.out.println("m2() in AB");
	}
	public void show()
	{
		System.out.println("show method in AB");
	}
}
class AC implements I
{
	public void m1()
	{
		System.out.println("m1() in AC");
	}
	public void m2()
	{
		System.out.println("m2() in AC");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		AB b=new AB();
		//I b=new AB();
		b.m1();
		b.m2();
		b.show();
		

	}

}
