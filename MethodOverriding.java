package javapack;

class P1
{
	public void show()
	{
		System.out.println("Parent class method");
	}
}
class P2 extends P1
{
	public void show()
	{
		System.out.println("Child class method");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		P2 b=new P2();
		b.show();

	}

}
