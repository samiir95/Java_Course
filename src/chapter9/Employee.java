package chapter9;

public class Employee extends Person {

	private String employeeID;
	private String employeeTitle;

	public Employee()
	{
//		super("Samir");
		System.out.println("In employee default constructor.");
	}
	
	public Employee(String name)
	{
	}
	
	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeTitle() {
		return employeeTitle;
	}

	public void setEmployeeTitle(String employeeTitle) {
		this.employeeTitle = employeeTitle;
	}
}
