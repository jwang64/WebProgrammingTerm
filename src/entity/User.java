package entity;

public class User {
	private String email;
	private String firstName;
	private String lastName;
	private String accountType;
	private String password;
	
	public User()
	{
		
	}
	public User(String e, String fN, String lN, String aT, String p)
	{
		email = e;
		firstName = fN;
		lastName = lN;
		accountType = aT;
		password = p;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getAccountType()
	{
		return accountType;
	}
	
	public String getPassword()
	{
		return password;
	}
}
