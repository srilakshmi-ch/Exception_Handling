import java.io.*;

public class File_not_found_Exception {

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	
	@SuppressWarnings({ "unused", "resource" })
	FileReader fr=new FileReader("c:\\text.java");
	
   } catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
   }
  
	}

}
