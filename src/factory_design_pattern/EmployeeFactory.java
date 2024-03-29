package factory_design_pattern;

public class EmployeeFactory {
	public static Employee getEmployee(String type) {
		if(type.trim().equalsIgnoreCase("android")) {
			return new AndroidDeveloper();
		}else if(type.trim().equalsIgnoreCase("web")) {
			return new WebDeveloper();
		}else {
			return null;
		}
	}
}
