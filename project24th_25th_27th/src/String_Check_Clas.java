

import java.util.Scanner;
@SuppressWarnings("serial")
class StringCheckException extends Exception
{
	 
	StringCheckException(String s)
	 {
	super(s);
}
}

public class String_Check_Clas{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try
    {
    	checkFunc();
    	System.out.println("string is present in class");
    }
    catch(StringCheckException e)
    {
    	System.out.println(e);
    	
    }
	}
	static void checkFunc() throws StringCheckException
	{
		 String arr[]= {"sri","basheera","roshini","lakshm","chitti"};
		  String str;
		  int count=0;
		  @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("enter string");
			str= sc.nextLine();
			for(String ch:arr)
			{
				if(str.equalsIgnoreCase(ch))
				{
					count=1;
					break;
				}
			}
			if(count==0)
			{
				throw new StringCheckException("'You are not Enrolled for the\r\n" + 
						"class'.");
			}
			
		
	}
}
