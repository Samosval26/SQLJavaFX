package application;

public class User {
	private String firsName;
	private String lastName;
	private String userName;
	private String password;
	private String location;
	private String gender;
	
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public User(String firsName, String lastName, String userName, String password, String location, String gender) {
		super();
		this.firsName = firsName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.location = location;
		this.gender = gender;
	}
	public User() {
	}

	
	
}
