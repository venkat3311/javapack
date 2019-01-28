package javapack;

class EC
{
	private int age;
	private String name;
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
}

public class EancapsulationDemo {

	public static void main(String[] args) {
		
		EC b1=new EC();
		b1.setName("selenium");
		//System.out.println("Name:"+b1.getName());
		EC b2=new EC();
		System.out.println("Name:"+b2.getName());

	}

}
