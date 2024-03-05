package singleton_design_pattern;

public class SingletonDesignPatternTest {
    public static void main(String[] args) {
        System.out.println(Singleton.getSingleton().hashCode());
        System.out.println(Singleton.getSingleton().hashCode());
        System.out.println(Singleton.getSingleton().hashCode());
        System.out.println(Singleton.getSingleton().hashCode());
        System.out.println(Singleton.getSingleton().hashCode());
    }
}
