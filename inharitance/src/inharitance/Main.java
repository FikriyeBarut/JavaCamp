package inharitance;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer();
		Employee employee=new Employee();
		
		EmployeeManager employeeManager=new EmployeeManager();
		employeeManager.Add();
		CustomerManager customerManager=new CustomerManager();
		customerManager.List();
	}

}
