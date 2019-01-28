package javapack;

class B
{
	void show()
	{
		System.out.println("Hiiiiiiiii");
	}
	B display()
	{
		System.out.println("Hello");
		return new B();
	}
}

public class MethoDemo2 {

	public static void main(String[] args) {
		
		B obj=new B();
		
		obj.display().show();
		//obj.show().display();

	}

}
