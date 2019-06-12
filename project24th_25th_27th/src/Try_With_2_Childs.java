

import java.util.Scanner;

public class Try_With_2_Childs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		  
		try
		{
			try
			{
				 System.out.println("enter two values a and b");
		  		   a=sc.nextInt();
		  		   b=sc.nextInt();
		  		   System.out.println(a+"/"+b+"="+a/b);
			}catch(ArithmeticException e)
			{      
				System.out.println("hii");
				System.out.println(e);
			}
			try
    		{

    			   
    			   int n;
    			 
    			   System.out.println("enter no of elements into an arary");
    			   n=sc.nextInt();
    			   System.out.println("enter elements");
    			   int a1[]=new int[n];
    			   
    			   for(int i=0;i<=n;i++)
    			   {
    				   a1[i]=sc.nextInt();
    			   }
    		}catch(ArrayIndexOutOfBoundsException e)
    		{
    			e.printStackTrace();
    		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	

	}

}
