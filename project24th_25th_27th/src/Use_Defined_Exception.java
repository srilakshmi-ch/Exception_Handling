import java.util.Scanner;

@SuppressWarnings("serial")
class user_def_exc extends Exception
{
	 
	user_def_exc(String s)
	 {
	super(s);
}
}
public class Use_Defined_Exception {
	static void positive_Accept(int n) throws user_def_exc 
	{
		if(n>0)
		{
			System.out.println("Given number is positive");
			
		}
		else
			throw new  user_def_exc("please enter positive value");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter positive number");
	int n = sc.nextInt();
	try
	{
      positive_Accept(n);
      
	}
	catch(user_def_exc e)
	{
		System.out.println(e);
	}

}}
