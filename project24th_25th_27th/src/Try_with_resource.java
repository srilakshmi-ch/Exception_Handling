import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Try_with_resource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try
    {
    	FileInputStream fi=new FileInputStream("D:\\ap.txt");
    	int i;
   
       while((i=fi.read())!=-1)
       {
    	   System.out.print((char)(i));
       }
    	fi.close();
    	FileOutputStream fo=new FileOutputStream("D:\\app.txt");
    	String msg="welcome to eclipse";
    	byte[] arr=msg.getBytes();
    	fo.write(arr);
    	fo.close();
    	
    	
    }catch(Exception e)
    {
    	System.out.println(e);
    }
	}

}
