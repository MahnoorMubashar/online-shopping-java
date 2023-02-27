import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Productwrite {
	
	public void add_product() throws IOException {
		//for admin to add products.
		Scanner reader=new Scanner(System.in);
		//int i=1;
		FileWriter fr3=null;
		String toWrite2= "";  
			System.out.println("enter product name");
			String name=reader.next();
			System.out.println("enter product id");
			String id=reader.next();
			System.out.println("enter product quantity");
			int quantity=reader.nextInt();
			System.out.println("enter category");
			String category=reader.next();
			System.out.println("enter price per product");
			int price=reader.nextInt();
	        Main.products.add(new Product(name,id,quantity,category,price));
	        fr3 = new FileWriter("C:\\Users\\Shumi\\eclipse-workspace\\product.txt");
	        for(int i=0; i<Main.products.size();i++) {
				//String toWrite1= ""; 
				toWrite2= toWrite2 + Main.products.get(i).product_name+","+ 
				Main.products.get(i).product_id+","+Main.products.get(i).product_quantity+","
				+Main.products.get(i).product_category+","+Main.products.get(i).product_price+"\n";
				}
	        fr3.write(toWrite2);
	        fr3.close();
	}
	//for admin to increase/decrease the quantity of current product//// 
	public void save(ArrayList<Product> prod) throws IOException {
		FileWriter fr = new FileWriter("C:\\Users\\Shumi\\eclipse-workspace\\product.txt");
        String toWrite2 = "";
		for(int i=0; i<Main.products.size();i++) {
			//String toWrite1= ""; 
			toWrite2= toWrite2 + Main.products.get(i).product_name+","+ 
			Main.products.get(i).product_id+","+Main.products.get(i).product_quantity+","
			+Main.products.get(i).product_category+","+Main.products.get(i).product_price+"\n";
			}
        fr.write(toWrite2);
        fr.close();
	}
	}
