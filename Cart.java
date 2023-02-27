
public class Cart {
String name;
int quantity,price;
public Cart(String name, int quantity, int price) {
	super();
	this.name = name;
	this.quantity = quantity;
	this.price = price;
}
@Override
public String toString() {
	return "Cart [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
}

}
