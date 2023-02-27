import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Product> products ;
	static ArrayList<User> users;
	static ArrayList<Cart> addtocart;
	static ArrayList<Admin> admins;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		products = new ArrayList<>();
		users= new ArrayList<>();
		addtocart= new ArrayList<>();
		admins= new ArrayList<>();
		Fileread fr= new Fileread();
		fr.admin_check();
		UserFileRead fr2= new UserFileRead();
		fr2.user_check();
		FileWrite fw= new FileWrite();
		Productwrite pw= new Productwrite();
		ProductRead pr= new ProductRead();
		pr.product_check();
	    //products.add(new Product ("earrings","er343",9,"jewellery",50));
	    //pw.save(products);
		
		
		//System.out.println(fr.adm);
		System.out.println("*************Welcome***********");
		System.out.println("do you want to enter as an admin or user?");
///// user and admin check/////////
		System.out.println("enter 1 for admin and 2 for user");
		Scanner input=new Scanner(System.in);
		int check;
		check=input.nextInt();
//////for admin////////////
		
		if(check==1)
		{
			
			System.out.println("enter name of your login");
			String Admin_name;
			Admin_name=input.next();
			System.out.println("enter your password");
			String Admin_password;
			Admin_password=input.next();
			int r=0;
			int b=0;
			
			for(int i=0; i<admins.size();i++) 
			{
				if(Admin_name.equals(admins.get(i).name)&&Admin_password.equals(admins.get(i).password)) 
				{
					System.out.println("welcome to admin console");
				
					while(b==0){
						int a=0;
						System.out.println("press 1 to add new admin, 2 to get admin data, 3 to add new product, 4 to get user data  "
								+ "5 to increase quantity of current products,6 to remove product, 7 to get specific user data,8 to log out");
						a=input.nextInt();
						switch(a) 
						{
							case 1:
						        fw.add_admin();
						        break;
							case 2:
								fr.read_file();
								break;
							case 3:
								pw.add_product();//product write
								break;
							case 4:
								fr2.user_fileread();
								break;
							case 5:
								System.out.println("enter the name of product");
								String product_name;
								product_name= input.next();
								System.out.println("enter id of the product");
								String product_id;
								product_id= input.next();
								for(int i1=0; i1<products.size();i1++) 
								{
									if(product_name.equals(products.get(i1).product_name)&&product_id.equals(products.get(i1).product_id)) 
									{   
										System.out.println("enter the quantity you want to increase");
										int quantity;
										quantity= input.nextInt();
										products.get(i1).product_quantity=products.get(i1).product_quantity+quantity;
										pw.save(products);
										//System.out.println(products.get(i).product_quantity);
									}	
								}
								break;
							case 6:
								System.out.println("enter the name of product");
								String product_name1;
								product_name1= input.next();
								System.out.println("enter id of the product");
								String product_id1;
								product_id1= input.next();
								for(int i1=0; i1<products.size();i1++) 
								{
									if(product_name1.equals(products.get(i1).product_name)&&product_id1.equals(products.get(i1).product_id)) 
								    {
										products.remove(i1);
										pw.save(products);
									}
								}
								break;
							case 7:
								System.out.println("enter the name ");
								String user_name;
								user_name=input.next();
								for(int i1=0; i1<users.size();i1++) 
								{
									if(user_name.equals(users.get(i1).user_name))
									{
										System.out.println(users.get(i1));
									}
								}
							    break;
							case 8:
								b++;
								break;
						}}
						
				}
				r++;
			}
		
			if(r!=0) 
			{
				System.out.println("incorrect user/password");
			}
	
		}
		////////for user///////
		if(check==2) {
			int choice=0;
			System.out.println("press 1 to register & press 2 to login");
			choice= input.nextInt();
			switch(choice) 
			{
				case 1:
		
					UserFileWrite uw= new UserFileWrite();
					uw.register();
					System.out.println("you have been registered now login as user");
		            break;
				case 2:
					System.out.println("enter name of your login");
					String user_name;
					user_name=input.next();
					System.out.println("enter your password");
					String user_password;
					user_password=input.next();
					int ch=0;
					for(int z=0; z<Main.users.size();z++)
					{
						if(user_name.equals(Main.users.get(z).user_name)&&user_password.equals(Main.users.get(z).user_password)) 
						{
							System.out.println("************welcome to shopping**********");
							System.out.println(products);
							int j=1;
							while(j!=0)
							{
								System.out.println("enter name or category of product");
								String search=input.next();
								for( int i=0 ; i < products.size(); i++) 
								{
									if((search.equals(products.get(i).product_name))||(search.equals(products.get(i).product_category)))
									{
										System.out.println(products.get(i).product_name+"/nPrice ="+products.get(i).product_price);
									}
								}
								System.out.println("enter the quantity");
							    int product_quantity=input.nextInt();
								for(int i=0;i<products.size();i++) 
								{
									if((search.equals(products.get(i).product_name))||(search.equals(products.get(i).product_category)))
									{
								    addtocart.add(new Cart(products.get(i).product_name,product_quantity,products.get(i).product_price*product_quantity));	
							    	products.get(i).product_quantity=products.get(i).product_quantity-product_quantity;
							    	pw.save(products);
									}
								}
								System.out.println("press 0 to exit shopping 1 for continue shopping");
								int s=input.nextInt();
								if(s==0) 
								{
									j=0;
								}
								else 
									j++;
							
							}
							int sum=0;
							System.out.println("detail of your shopping is;");
							System.out.println("Name\tQuantity\tPricePerProduct");
							for( int i=0 ; i < addtocart.size(); i++) 
							{
								System.out.println(addtocart.get(i).name+"\t"+addtocart.get(i).quantity+"\tt"+addtocart.get(i).price);
								sum=sum+addtocart.get(i).price;
							} 
							System.out.println("your total bill is"+sum);
							System.out.println("how would you prefere to pay the bill,online or cash on delivery(COD)");
						    String payment_option=input.next();
						    if(payment_option.equals("online")) 
						    {
						    	System.out.println("enter bank's name");
						    	String bank_name=input.next();
						    	System.out.println("enter your card type; debit/credit");
						    	String card_type=input.next();
						    	System.out.println("enter your card number");
						    	String card_number=input.next();
						    	System.out.println("enter your contact number");
						    	String contact_number=input.next();
						    }
						    System.out.println("we would like to hear about your experience for the shopping");
						    ReviewWrite addreview=new ReviewWrite();
						    addreview.add_reviews(Main.users.get(z).user_name);
						    System.out.println("your parcel will be delivered in 4 to 5 working days");
						    System.out.println("thank you for shopping.goodbye:)");
							}
						    
						    ch++;
						  
						}
					if(ch!=0) {
						System.out.println("incorrect user/password");
					}
					break;
				
			}
			
		
		}
		}
}
	



