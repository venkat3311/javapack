package javapack;

class A
{
	int x=10,y=20; //x, y Instance var
	void sum1()
	{
		System.out.println("Sum1:"+(x+y));
	}
	void sum2(int a,int b) //a,b Local var
	{
		System.out.println("Sum2:"+(a+b));
	}
	int sum3()
	{
		return x+y;
	}
}

public class MethDemo {

	public static void main(String[] args) {
		
		A obj=new A();
		obj.sum1();
		obj.sum2(1, 2);
		/*int result=obj.sum3();
		System.out.println("sum3:"+result);*/
		System.out.println("Sum3:"+obj.sum3());
		

	}

}
