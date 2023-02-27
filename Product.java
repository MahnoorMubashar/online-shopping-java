
public class Product {
String product_name, product_id,product_category;
int product_price;
int product_quantity;
public Product(String product_name, String product_id, int product_quantity, String product_category,
		int product_price) {
	super();
	this.product_name = product_name;
	this.product_id = product_id;
	this.product_quantity = product_quantity;
	this.product_category = product_category;
	this.product_price = product_price;
}
@Override
public String toString() {
	return "Product [product_name=" + product_name + ", product_id=" + product_id + ", product_category="
			+ product_category + ", product_price=" + product_price + ", product_quantity=" + product_quantity + "]";
}



}
