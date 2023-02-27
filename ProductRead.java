import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductRead {
	///to read all data////
	public void read_file() throws IOException {
	FileReader fr=null;
	try {
		fr = new FileReader("C:\\Users\\Shumi\\eclipse-workspace\\product.txt");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}    
 int i1;    
 try {
		while((i1=fr.read())!=-1)    
		 System.out.print((char)i1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}    
 try {
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  }
	//// to check product for admin/////
	public void product_check() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Shumi\\eclipse-workspace\\product.txt"));
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
       
          Main.products.add(new Product(token[0], token[1],Integer.parseInt(token[2]),token[3],Integer.parseInt(token[4])));
	
}
}
