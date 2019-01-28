package javapack;

class C
{
	int x,y;
	C(int x)
	{
		System.out.println("1 param cons:"+x);
	}
	C(int x,int y)
	{
		this(10);
		this.x=x;
		this.y=y;
		this.show();
	}
	void show()
	{
		System.out.println("Show method");
	}
	void sum()
	{
		System.out.println("Sum:"+(x+y));
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		C b=new C(1,2);
		b.sum();

	}

}
