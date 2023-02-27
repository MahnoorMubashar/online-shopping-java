import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserFileWrite {
	//to register new user//////
public void register() throws IOException{
	Scanner reader=new Scanner(System.in);
	FileWriter fr2=null;
	String toWrite2= "";  
		System.out.println("enter your name");
		String name=reader.next();
		System.out.println("create password");
		String password=reader.next();
		System.out.println("enter your email");
		String email=reader.next();
		System.out.println("enter your address");
		String address=reader.next();
        Main.users.add(new User(name,password,email,address));
        fr2 = new FileWriter("C:\\Users\\Shumi\\eclipse-workspace\\user.txt");
        for(int i=0; i<Main.users.size();i++) {
			//String toWrite1= ""; 
			toWrite2= toWrite2 +Main.users.get(i).user_name+","+ Main.users.get(i).user_password+","+Main.users.get(i).user_email+","+Main.users.get(i).user_address+"\n";
			}
        fr2.write(toWrite2);
        fr2.close();
}

}
