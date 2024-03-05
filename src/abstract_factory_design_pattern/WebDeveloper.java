package abstract_factory_design_pattern;


public class WebDeveloper implements Employee{
    @Override
    public String name() {
        System.out.println("WebDeveloper");
        return "WebDeveloper";
    }

    @Override
    public Double salary() {
        return 50000.00;
    }
}