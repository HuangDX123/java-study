package day10;

public class Customer1 {

	private String firstName;
	private String lastName;
	private Account account;


	public Customer1(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {

		return lastName;
	}


}
