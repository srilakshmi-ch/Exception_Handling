import java.util.Scanner;

public class ArrayIndex_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int a[]=new int[5];
		System.out.println("Enter elemenmts into array");
		try
		{
			for(int i=0;i<=n;i++)
			{
				a[i]=sc.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("program ends");
	}

}
