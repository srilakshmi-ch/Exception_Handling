import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		   System.out.println("enter string");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			String str;
			str=sc.nextLine();
			
			try
			{
				System.out.println(2/0);
				System.out.println(str.charAt(50));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			System.out.println("program ends");
		}

}
