package javapack;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try
		{
			int x=10,y=2;
			int z=x/y;
			System.out.println("Z Value is:"+z);
			int a[]= {1,2,3,4};
			a[9]=10;
			System.out.println("********** End of try block **********");
		}
		/*catch(Exception e)
		{
			System.out.println(e);
			System.out.println("********** End of catch block **********");
		}*/
		finally
		{
			System.out.println("******** Finally block **********");
		}
		
		/*catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("********** End of catch block1 **********");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
			System.out.println("********** End of catch block2 **********");
		}*/

		System.out.println("******* End of Program **********");

	}

}
