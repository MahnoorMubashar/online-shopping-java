import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UserFileRead {
	///to get all data of user////
	public void user_fileread() throws IOException 
	{
		FileReader fr=null;
		
			fr = new FileReader("C:\\Users\\Shumi\\eclipse-workspace\\user.txt");
		   
	 int i1;    
	 
			while((i1=fr.read())!=-1) {   
			 System.out.print((char)i1);
		
		}    
			fr.close();
		
     }
	/////to check user login/////
     public void user_check() throws IOException
     {

         BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Shumi\\eclipse-workspace\\user.txt"));
         String line = "";
         while((line = br.readLine())!=null)
         {
           // System.out.println(line);
             tokenize(line);
         }	
     }
     public static void tokenize(String line)
 	{
 		String token[] = line.split(",");
        
 		Main.users.add(new User(token[0], token[1], token[2], token[3]));
 	
 }

}
