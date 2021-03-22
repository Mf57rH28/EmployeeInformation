
public class Employee {

	private String userName;
	private String password;
	private String employeeName;
	private int employeeAge;
	private String email;

	Employee() {

	}

	Employee(String newUserName, String newPassword, String newEmployeeName, int newEmployeeAge, String newEmail) {
		userName = newUserName;
		password = newPassword;
		employeeName = newEmployeeName;
		employeeAge = newEmployeeAge;
		email = newEmail;
	}

	// setter and getter methods
	public String getUsername() {
		return userName;
	}

	public void setUsername(String newUsername) {
		userName = newUsername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String newPassword) {
		password = newPassword;
	}

	public String getFirstname() {
		return employeeName;
	}

	public void setFirstname(String newEmployeeName) {
		employeeName = newEmployeeName;
	}

	public int getLastname() {
		return employeeAge;
	}

	public void setLastname(int newEmployeeAge) {
		employeeAge = newEmployeeAge;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String newEmail) {
		email = newEmail;
	}

	public String toString() {
		return "( The User Name is : " + userName + ", The Password is : " + password + "," + "\n"
				+ "The Employee’s Name is : " + employeeName + ", The Employee’s Age : " + employeeAge
				+ ", The Employee’s Email is : " + email + " )";
	}

}
