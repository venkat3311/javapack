package javapack;

class B
{
	int x=1,y=2;
	public void sub()
	{
		System.out.println("Subtraction:"+(y-x));
	}
	public void sum()
	{
		System.out.println("Sum:"+(x+y));
	}
	
}

public class MethDemo2 {

	public static void main(String[] args) {
		
		B b1=new B();
		b1.sub();
		b1.sum();
		B b2=new B();
		b2.sub();
		b2.sum();

	}

}
