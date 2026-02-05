package model;

import java.io.Serializable;

public class User  implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String pass;
	
	// constructor for User
	public User() { }
	public User(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}
	// getter
	public String getName() {return name; }
	public String getPass() { return pass; }

}
