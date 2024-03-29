package abstract_factory_design_pattern;

public class AbstractFactoryDesignPatternTest {
	
	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmployee(new AbstractAndroidDeveloperFactory());
		employee.name();
		Employee employee1 = EmployeeFactory.getEmployee(new AbstractWebDeveloperFactory());
		employee1.name();
	}

}
