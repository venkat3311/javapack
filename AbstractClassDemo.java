package javapack;

abstract class Shapes
{
	abstract void area();
	public void show()
	{
		System.out.println("Show method in abstract class");
	}
}

class Rect extends Shapes
{
	int l,b;
	Rect(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void area()
	{
		System.out.println("Area of Rect:"+(l*b));
	}
}
class Tri extends Shapes
{
	int l,b;
	Tri(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void area()
	{
		System.out.println("Area of Tri:"+(0.5*l*b));
		super.show();
	}
}


public class AbstractClassDemo {

	public static void main(String[] args) {
		Rect r=new Rect(10,20);
		r.area();
		Tri t=new Tri(10,20);
		t.area();
		//t.show();
        
	}

}
