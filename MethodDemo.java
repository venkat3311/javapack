package javapack;

class A
{
	int x=10,y=20; // Instance var
	void sum1()
	{
		System.out.println("Sum1:"+(x+y));
	}
	void sum2(int a,int b) // a, b local var
	{
		System.out.println("Sum2:"+(a+b));
	}
	int sum3()
	{
		return x+y;
	}
}

public class MethodDemo {

	public static void main(String[] args) {
		
		//System.out.println("Welcome to java");
		A b=new A();
		b.sum1();
		b.sum2(1, 2);
		int result=b.sum3();
		System.out.println("Sum3:"+result);

	}

}
