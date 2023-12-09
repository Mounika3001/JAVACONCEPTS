package shadowingProblem;

public class EmployeeApp {
public static void main(String[] args) {
	//Instantiation of object.
	Employee e1=new Employee(101, "Raju", 100000);
	System.out.println(e1.id);
	System.out.println(e1.name);
	System.out.println(e1.salary);
}
}
