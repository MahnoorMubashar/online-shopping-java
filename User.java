public class User {
String user_name,user_password,user_email,user_address;

public User(String user_name, String user_password, String user_email, String user_address) {
	super();
	this.user_name = user_name;
	this.user_password = user_password;
	this.user_email = user_email;
	this.user_address = user_address;
}

@Override
public String toString() {
	return "User [user_name=" + user_name + ", user_password=" + user_password + ", user_email=" + user_email
			+ ", user_address=" + user_address + "]";
}

}
