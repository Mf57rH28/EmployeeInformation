
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee Employee1 = new Employee("Employee1", "Ko9N3*J69Sc", "Mufarreh", 26, "MyEmail@njuf.com");

		System.out.println("Employee : " + Employee1.toString());

		System.out.println();

		System.out.println("I will change my User Name to :- ");

		Employee1.setUsername("Employee1");
		System.out.println("My new username is: " + Employee1.getUsername());

		System.out.println("My password is: " + Employee1.getPassword());

		System.out.println("I will change my password to :- ");

		Employee1.setPassword("H9prT5#d");
		System.out.println("My new password is: " + Employee1.getPassword());

	}

}
