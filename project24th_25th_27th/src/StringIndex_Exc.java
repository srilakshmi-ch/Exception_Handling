import java.util.Scanner;

public class StringIndex_Exc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter string");
		str=sc.nextLine();
		
		try
		{
			System.out.println(str.charAt(50));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("program ends");
	}

}
