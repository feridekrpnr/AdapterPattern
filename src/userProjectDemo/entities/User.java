package userProjectDemo.entities;

public class User {

	private int id;
	private String firstName;
	private String lastName;
	private String tcNo;
	private int getDateOfBirth;
	public User() {
		super();
	}
	public User(int id, String firstName, String lastName, String tcNo, int getDateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tcNo = tcNo;
		this.getDateOfBirth = getDateOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public int getGetDateOfBirth() {
		return getDateOfBirth;
	}
	public void setGetDateOfBirth(int getDateOfBirth) {
		this.getDateOfBirth = getDateOfBirth;
	}
	

	
	


}
