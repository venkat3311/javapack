package javapack;

class P
{
	public void show()
	{
		System.out.println("Parent class method");
	}
}

class Q extends P
{
	public void display()
	{
		System.out.println("Child class method");
	}
}

public class InherDemo {

	public static void main(String[] args) {
		Q b=new Q();
		b.display();
		b.show();

	}

}
