package abstract_factory_design_pattern;

public class AbstractWebDeveloperFactory extends AbstractEmployeeFactory{

	@Override
	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return new WebDeveloper();
	}

}
