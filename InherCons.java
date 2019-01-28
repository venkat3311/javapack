package javapack;

class M
{
	M(int x)
	{
		System.out.println("Parent cons:"+x);
	}
	void show()
	{
		System.out.println("Parent show method");
	}
}
class N extends M
{
	N()
	{
		super(10);
		System.out.println("Child cons");
		super.show();
	}
}

public class InherCons {

	public static void main(String[] args) {
		N b=new N();

	}

}
