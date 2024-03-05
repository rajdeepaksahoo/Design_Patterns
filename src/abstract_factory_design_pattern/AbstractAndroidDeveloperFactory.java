package abstract_factory_design_pattern;

public class AbstractAndroidDeveloperFactory extends AbstractEmployeeFactory{

	@Override
	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return new AndroidDeveloper();
	}

}
