

import java.util.Scanner;
@SuppressWarnings("serial")
class LengthCheckException extends Exception
{
	 
	LengthCheckException(String s)
	 {
	super(s);
}
}

public class Length_Exception_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str= sc.nextLine();
		try 
		{
			length_check(str);
		}catch(LengthCheckException e)
		{
			e.printStackTrace();
		}
		  
		
	}

	private static void length_check(String str) throws LengthCheckException {
		// TODO Auto-generated method stub
		if(str.length()>15)
		{
			throw new LengthCheckException("'Please enter shorter name'.");
		}
		else
		{
			System.out.println("gieven String is valid");
		}
	}

}
