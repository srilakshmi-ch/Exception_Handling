
public class String_NullException {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str=null;
    
     try
     {
    	 System.out.println(str.charAt(24));
     }
	
	catch(NullPointerException e)
	{
		System.out.println(e);
	}

}}
