package javapack;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
public class UserException {

	public static void main(String[] args) throws InvalidAgeException {
		
		int age=10;
        if(age>18)
        {
        	System.out.println("Eligible for vote");
        }
        else
        {
        	throw new InvalidAgeException("Not eligible for vote");
        }
        System.out.println("******** End of program ***********");

	}

}
