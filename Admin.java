
public class Admin {
	String name,password;

	  
	    public Admin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}


		@Override
		public String toString() {
			return "Admin [name=" + name + ", password=" + password + "]";
		}	}

