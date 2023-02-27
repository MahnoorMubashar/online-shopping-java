import java.io.FileWriter;  
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class FileWrite {
	public void add_admin() 
	{
		Scanner reader=new Scanner(System.in);
		FileWriter fr1=null;
		String toWrite1= "";  
			System.out.println("enter name of the admin");
			String name=reader.next();
			System.out.println("create a password");
			String password=reader.next();
			Main.admins.add(new Admin(name,password));
			
			try {
				fr1 = new FileWriter("C:\\Users\\Shumi\\eclipse-workspace\\adminfile.txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0; i<Main.admins.size();i++) {
			//String toWrite1= ""; 
			toWrite1= toWrite1 + Main.admins.get(i).name+","+ Main.admins.get(i).password+"\n";
			}
		try {
			fr1.write(toWrite1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fr1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}
	
}		


