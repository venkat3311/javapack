package javapack;

class D
{
	//int x=10,y=20;
	int x,y;
	D(int a,int b)
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println("sum:"+(x+y));
	}
}

public class ConsDemo {

	public static void main(String[] args) {
		
		D b1=new D(1,2);
		//b1.sum();
		D b2=new D(2,3);
		//b2.sum();
		D b3=new D(10,20);
		b2.sum();

	}

}
