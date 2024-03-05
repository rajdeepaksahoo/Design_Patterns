package factory_design_pattern;

public class FactoryDesignPatternTest {
	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmployee("Web");
		employee.name();
		Employee employee1 = EmployeeFactory.getEmployee("android");
		employee1.name();
	}
}
