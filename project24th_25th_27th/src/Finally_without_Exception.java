import java.util.Scanner;

public class Finally_without_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("this is finally block");
		}
		System.out.println("program ends");
	}

}
