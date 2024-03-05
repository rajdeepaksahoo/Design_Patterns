package factory_design_pattern;

public class AndroidDeveloper implements Employee{
    @Override
    public String name() {
        System.out.println("AndroidDeveloper");
        return "AndroidDeveloper";
    }

    @Override
    public Double salary() {
        return 40000.00;
    }
}
