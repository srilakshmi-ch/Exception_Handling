

import java.util.Scanner;

@SuppressWarnings("serial")
class GreterThan100Exception extends Exception
{
	 
	GreterThan100Exception(String s)
	 {
	super(s);
}
}
public class Greater_than_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 values");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		try
		{
			check_sum(a,b,c);
			
		}catch(GreterThan100Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void check_sum(int a, int b, int c) throws GreterThan100Exception {
		// TODO Auto-generated method stub
		if((a+b+c)>100)
		{
			throw new GreterThan100Exception(" 'Please enter the numbers, which totla is below 100'");
		}
		else
		{
			System.out.println("sum of 3 nors is = "+(a+b+c));
		}
	}

}
