

import java.io.*;
import java.util.Scanner;

public class Throw_Throws_usage {
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     try
     {
    	 func1();
     }
     catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
     {
    	 System.out.println(e);
     }
	}
	  static void func1()throws ArrayIndexOutOfBoundsException , ArithmeticException, IOException
	   {
		   func2();
		   int n;
		   @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter no of elements into an arary");
		   n=sc.nextInt();
		   System.out.println("enter elements");
		   int a[]=new int[n];
		   
		   for(int i=0;i<=n;i++)
		   {
			   a[i]=sc.nextInt();
		   }
		   throw new IOException("io exception is raised manually by using throew keyword ");
		   
	   }
	  static void func2()throws ArithmeticException  
	  {   int a,b;
		  @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter two values a and b");
		   a=sc.nextInt();
		   b=sc.nextInt();
		   System.out.println(a+"/"+b+"="+(float)a/b);
	  }

}
