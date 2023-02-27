import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReviewWrite {
	ArrayList<Reviews>reviews;
	public void add_reviews(String name) throws IOException 
	{
		FileWriter FW=new FileWriter("C:\\Users\\Shumi\\eclipse-workspace\\reviews.txt",true);
		reviews = new ArrayList();
		Scanner write=new Scanner(System.in);
		System.out.println("select your experience");
		System.out.println("good/bad/satisfactory");
		String option=write.next();
		String add="";
		reviews.add(new Reviews(name,option));
		for (int i=0; i<reviews.size();i++) 
		{
		add=add+reviews.get(i).name+"," +reviews.get(i).review+"\n";	
		}
		FW.write(add);
		FW.close();
		
	}
}
