package javapack;

public class SwapDemo {

	public static void main(String[] args) {
		
		int x=3,y=5;
		System.out.println("********** Before swap *******");
		System.out.println("x:"+x+","+"y:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("********** After swap *******");
		System.out.println("x:"+x+","+"y:"+y);

	}

}
